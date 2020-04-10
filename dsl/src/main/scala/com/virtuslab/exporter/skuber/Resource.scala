package com.virtuslab.exporter.skuber

import play.api.libs.json.Format
import skuber.{ ObjectResource, ResourceDefinition }

case class Resource[A <: ObjectResource: Format: ResourceDefinition](obj: A) {
  def format: Format[A] = implicitly[Format[A]]
  def definition: ResourceDefinition[A] = implicitly[ResourceDefinition[A]]
}