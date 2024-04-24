package com.example.entities

import io.micronaut.core.annotation.ReflectiveAccess
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Version
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity(value = "person")
@ReflectiveAccess
data class PersonEntity(
    @field:Id
    @field:GeneratedValue
    val id: Long? = null,

    @field:Version
    val version: Long? = null,

    val firstName: String? = null,
    val lastName: String? = null,
)
