package com.cs.sigm.person.repository

import com.cs.sigm.person.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Double>