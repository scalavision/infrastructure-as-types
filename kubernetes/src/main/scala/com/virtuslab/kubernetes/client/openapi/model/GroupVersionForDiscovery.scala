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
  * GroupVersion contains the \"group/version\" and \"version\" string of a version. It is made a struct to keep extensibility.
  */
case class GroupVersionForDiscovery(
    /* groupVersion specifies the API group and version in the form \"group/version\" */
    groupVersion: String,
    /* version specifies the version in the form of \"version\". This is to save the clients the trouble of splitting the GroupVersion. */
    version: String)
  extends ApiModel
