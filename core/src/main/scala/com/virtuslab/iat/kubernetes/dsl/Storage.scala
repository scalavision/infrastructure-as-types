package com.virtuslab.iat.kubernetes.dsl

sealed trait Storage
final case class EphemeralStorage() extends Storage

object PersistentStorage {
  final case class Config()
}
final case class PersistentStorage() extends Storage
