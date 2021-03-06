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
  * EndpointAddress is a tuple that describes single IP address.
  */
case class EndpointAddress(
    /* The Hostname of this endpoint */
    hostname: Option[String] = None,
    /* The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready. */
    ip: String,
    /* Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node. */
    nodeName: Option[String] = None,
    targetRef: Option[ObjectReference] = None)
  extends ApiModel
