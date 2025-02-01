package com.cs.sigm.person.model

import com.cs.sigm.person.model.definition.Country
import com.cs.sigm.person.model.definition.State
import jakarta.persistence.*

@Entity
@Table(name = "address", schema = "person")
class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(unique = true, nullable = false)
    var id: Int,

    var addressLine1: String,

    var addressLine2: String,

    var addressLine3: String,

    @Enumerated(EnumType.STRING)
    var country: Country,

    @Enumerated(EnumType.STRING)
    var state: State,

    var city: String,

    var zipCode: String
)