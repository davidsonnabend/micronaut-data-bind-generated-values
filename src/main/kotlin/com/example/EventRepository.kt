package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.GenericRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
interface EventRepository : GenericRepository<Event, Long> {
    fun save(event: Event): Event
    fun saveReturning(event: Event): Event
}
