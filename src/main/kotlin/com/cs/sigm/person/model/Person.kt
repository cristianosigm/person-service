package com.cs.sigm.person.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotEmpty

@Entity
@Table(name = "person", schema = "person-data")
class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(unique = true, nullable = false)
    var id: Double,

    @NotEmpty
    var firstName: String,

    var lastName: String,
) {
}