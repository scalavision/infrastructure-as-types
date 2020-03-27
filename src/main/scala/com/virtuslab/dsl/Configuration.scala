package com.virtuslab.dsl

trait Configuration extends Reference

object Configuration {
  final case class ConfigurationDefinition(
      labels: Labels,
      namespace: Namespace,
      data: Map[String, String])
    extends Configuration
    with Namespaced

  final case class ConfigurationReference(labels: Labels, data: Map[String, String]) extends Configuration {
    def define(implicit builder: NamespaceBuilder): ConfigurationDefinition = {
      ConfigurationDefinition(
        labels = labels,
        namespace = builder.namespace,
        data = data
      )
    }
  }

  def ref(
      labels: Labels,
      data: Map[String, String]
    )(implicit
      builder: SystemBuilder
    ): ConfigurationReference = {
    val conf = ConfigurationReference(
      labels = labels,
      data = data
    )
    builder.references(conf)
    conf
  }

  def apply(
      labels: Labels,
      data: Map[String, String]
    )(implicit
      builder: NamespaceBuilder
    ): ConfigurationDefinition = {
    val conf = ref(
      labels = labels,
      data = data
    )(builder.systemBuilder).define
    builder.references(conf)
    conf
  }
}
