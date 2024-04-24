package com.example.repositories

import com.example.entities.PersonEntity
import com.example.jooq.generated.tables.references.PERSON
import io.micronaut.data.connection.annotation.Connectable
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.GenericRepository
import org.jooq.DSLContext

@JdbcRepository(dialect = Dialect.POSTGRES)
abstract class PersonRepository(
    private val jooqContext: DSLContext,
) : GenericRepository<PersonEntity, Long> {

    @Connectable
    open fun customJooqOperation() {
        jooqContext.selectFrom(PERSON).fetch()
    }

    abstract fun findAll(): List<PersonEntity>
}
