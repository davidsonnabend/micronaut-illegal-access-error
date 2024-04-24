package com.example.services

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest

@MicronautTest
class PersonServiceImplTest(
    private val personServiceImpl: PersonServiceImpl,
) : ShouldSpec({

    should("return all known persons from db") {
        shouldNotThrowAny { personServiceImpl.getPersons() }
    }
})
