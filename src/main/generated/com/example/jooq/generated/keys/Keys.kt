/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.keys


import com.example.jooq.generated.tables.Person
import com.example.jooq.generated.tables.records.PersonRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val PERSON_PKEY: UniqueKey<PersonRecord> = Internal.createUniqueKey(Person.PERSON, DSL.name("person_pkey"), arrayOf(Person.PERSON.ID), true)
