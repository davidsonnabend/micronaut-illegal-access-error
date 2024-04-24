/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated


import com.example.jooq.generated.tables.Person

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DefaultSchema : SchemaImpl("", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>DEFAULT_SCHEMA</code>
         */
        val DEFAULT_SCHEMA: DefaultSchema = DefaultSchema()
    }

    /**
     * The table <code>person</code>.
     */
    val PERSON: Person get() = Person.PERSON

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Person.PERSON
    )
}
