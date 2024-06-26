/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.pojos


import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
@Entity
@Table(
    name = "person"
)
data class Person(
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    val id: Long? = null,
    @get:Column(name = "version", nullable = false)
    val version: Long? = null,
    @get:Column(name = "first_name", nullable = false, length = 255)
    val firstName: String? = null,
    @get:Column(name = "last_name", nullable = false, length = 255)
    val lastName: String? = null
): Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Person = other as Person
        if (this.id == null) {
            if (o.id != null)
                return false
        }
        else if (this.id != o.id)
            return false
        if (this.version == null) {
            if (o.version != null)
                return false
        }
        else if (this.version != o.version)
            return false
        if (this.firstName == null) {
            if (o.firstName != null)
                return false
        }
        else if (this.firstName != o.firstName)
            return false
        if (this.lastName == null) {
            if (o.lastName != null)
                return false
        }
        else if (this.lastName != o.lastName)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id == null) 0 else this.id.hashCode())
        result = prime * result + (if (this.version == null) 0 else this.version.hashCode())
        result = prime * result + (if (this.firstName == null) 0 else this.firstName.hashCode())
        result = prime * result + (if (this.lastName == null) 0 else this.lastName.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Person (")

        sb.append(id)
        sb.append(", ").append(version)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)

        sb.append(")")
        return sb.toString()
    }
}
