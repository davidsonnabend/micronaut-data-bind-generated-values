package com.example

import io.micronaut.data.annotation.*
import io.micronaut.serde.annotation.Serdeable
import java.time.LocalDateTime

@Serdeable
@MappedEntity
data class Event(
    @field:Id
    @field:GeneratedValue
    val id: Long? = null,

    @field:Version
    val version: Long? = null,

    @field:GeneratedValue
    val createdAt: LocalDateTime? = null,

    val property: String,

    @Relation(value = Relation.Kind.MANY_TO_ONE)
    val child: Child? = null,
)
