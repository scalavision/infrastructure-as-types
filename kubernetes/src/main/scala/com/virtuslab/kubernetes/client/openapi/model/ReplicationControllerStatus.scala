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
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
case class ReplicationControllerStatus(
    /* The number of available replicas (ready for at least minReadySeconds) for this replication controller. */
    availableReplicas: Option[Int] = None,
    /* Represents the latest available observations of a replication controller's current state. */
    conditions: Option[Seq[ReplicationControllerCondition]] = None,
    /* The number of pods that have labels matching the labels of the pod template of the replication controller. */
    fullyLabeledReplicas: Option[Int] = None,
    /* ObservedGeneration reflects the generation of the most recently observed replication controller. */
    observedGeneration: Option[Long] = None,
    /* The number of ready replicas for this replication controller. */
    readyReplicas: Option[Int] = None,
    /* Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller */
    replicas: Int)
  extends ApiModel
