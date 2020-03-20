package com.virtuslab.dsl.interpreter

import com.virtuslab.dsl.Configuration.ConfigurationDefinition
import skuber.{ ConfigMap, ObjectMeta }

class ConfigurationInterpreter() {
  def apply(configuration: ConfigurationDefinition): ConfigMap = {
    ConfigMap(
      metadata = ObjectMeta(
        name = configuration.name,
        namespace = configuration.namespace.name,
        labels = configuration.labels.toMap
      ),
      data = configuration.data
    )
  }
}
