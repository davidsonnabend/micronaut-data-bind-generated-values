package com.example

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Version
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Child(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    val id: Long? = null,

    @field:Version
    val version: Long? = null,

    val value: String? = null,
)
