package com.virtuslab.dsl.interpreter

import com.virtuslab.dsl.Application.ApplicationDefinition
import com.virtuslab.dsl.Configuration.ConfigurationDefinition
import com.virtuslab.dsl.DistributedSystem.DefinedDistributedSystem
import com.virtuslab.dsl.{ Connection, SystemBuilder }

class SystemInterpreter(
    system: DefinedDistributedSystem,
    applicationInterpreters: PartialFunction[
      ApplicationDefinition,
      ApplicationInterpreter
    ],
    config: ConfigurationInterpreter,
    connection: ConnectionInterpreter,
    namespace: NamespaceInterpreter) {

  def resources: Seq[skuber.ObjectResource] = {
    system.namespaces.flatMap { ns =>
      Seq(namespace(ns)) ++ ns.members.toSeq.flatMap {
        case app: ApplicationDefinition =>
          if (applicationInterpreters.isDefinedAt(app)) {
            val (svc, dpl) = applicationInterpreters(app)(app)
            Seq(svc, dpl)
          } else {
            throw new IllegalArgumentException(
              s"Application $app is not suitable for the interpreter."
            )
          }
        case cfg: ConfigurationDefinition =>
          Seq(config(cfg))
        case cnn: Connection[_, _, _] =>
          Seq(connection(cnn))
        case o =>
          println("No interpreter for: " + o)
          Seq()
      }
    }
  }.toSeq
}

object SystemInterpreter {
  def apply(
      system: DefinedDistributedSystem,
      applicationInterpreters: PartialFunction[
        ApplicationDefinition,
        ApplicationInterpreter
      ],
      configurationInterpreter: ConfigurationInterpreter,
      connectionInterpreter: ConnectionInterpreter,
      namespaceInterpreter: NamespaceInterpreter
    ): SystemInterpreter = new SystemInterpreter(
    system,
    applicationInterpreters,
    configurationInterpreter,
    connectionInterpreter,
    namespaceInterpreter
  )

  def of(system: DefinedDistributedSystem): SystemInterpreter = {
    new SystemInterpreter(
      system, {
        case _: ApplicationDefinition => new ApplicationInterpreter(system)
      },
      new ConfigurationInterpreter,
      new ConnectionInterpreter(system),
      new NamespaceInterpreter
    )
  }

  def of(builder: SystemBuilder): SystemInterpreter = {
    of(builder.build())
  }
}
