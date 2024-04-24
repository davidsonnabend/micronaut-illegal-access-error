package com.example.services

import com.example.entities.PersonEntity
import com.example.repositories.PersonRepository
import jakarta.inject.Singleton

@Singleton
class PersonServiceImpl(
    private val personRepository: PersonRepository,
) : PersonService {

    override fun getPersons(): List<PersonEntity> = personRepository.findAll()
}
