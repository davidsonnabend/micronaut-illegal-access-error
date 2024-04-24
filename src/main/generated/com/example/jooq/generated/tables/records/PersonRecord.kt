/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.records


import com.example.jooq.generated.tables.Person

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
@Entity
@Table(
    name = "person"
)
open class PersonRecord() : UpdatableRecordImpl<PersonRecord>(Person.PERSON) {

    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    @get:Column(name = "version", nullable = false)
    open var version: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    @get:Column(name = "first_name", nullable = false, length = 255)
    open var firstName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @get:Column(name = "last_name", nullable = false, length = 255)
    open var lastName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PersonRecord
     */
    constructor(id: Long? = null, version: Long? = null, firstName: String? = null, lastName: String? = null): this() {
        this.id = id
        this.version = version
        this.firstName = firstName
        this.lastName = lastName
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    constructor(value: com.example.jooq.generated.tables.pojos.Person?): this() {
        if (value != null) {
            this.id = value.id
            this.version = value.version
            this.firstName = value.firstName
            this.lastName = value.lastName
            resetChangedOnNotNull()
        }
    }
}
