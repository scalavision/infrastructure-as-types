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
package org.openapitools.client.model

import com.virtuslab.kubernetes.client.openapi.core.ApiModel

  /**
   * VolumeAttachmentStatus is the status of a VolumeAttachment request.
   */
case class VolumeAttachmentStatus(
  attachError: Option[VolumeError] = None,
  /* Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher. */
  attached: Boolean,
  /* Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher. */
  attachmentMetadata: Option[Map[String, String]] = None,
  detachError: Option[VolumeError] = None
) extends ApiModel

