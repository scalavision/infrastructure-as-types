/**
  * Kubernetes
  * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  *
  * The version of the OpenAPI document: v1.15.10
  *
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package com.virtuslab.kubernetes.client.openapi.model

import java.time.OffsetDateTime
import org.json4s.JObject
import com.virtuslab.kubernetes.client.openapi.core.ApiModel

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
  */
case class ManagedFieldsEntry(
    /* APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted. */
    apiVersion: Option[String] = None,
    /* Fields identifies a set of fields. */
    fields: Option[JObject] = None,
    /* Manager is an identifier of the workflow managing these fields. */
    manager: Option[String] = None,
    /* Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'. */
    operation: Option[String] = None,
    /* Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply' */
    time: Option[OffsetDateTime] = None)
  extends ApiModel
