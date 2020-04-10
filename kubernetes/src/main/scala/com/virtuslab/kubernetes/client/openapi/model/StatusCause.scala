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

import com.virtuslab.kubernetes.client.openapi.core.ApiModel

  /**
   * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
   */
case class StatusCause(
  /* The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\" */
  field: Option[String] = None,
  /* A human-readable description of the cause of the error.  This field may be presented as-is to a reader. */
  message: Option[String] = None,
  /* A machine-readable description of the cause of the error. If this value is empty there is no information available. */
  reason: Option[String] = None
) extends ApiModel

