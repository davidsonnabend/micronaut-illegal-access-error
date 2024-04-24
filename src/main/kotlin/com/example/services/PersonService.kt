package com.example.services

import com.example.entities.PersonEntity

interface PersonService {

    fun getPersons(): List<PersonEntity>
}
