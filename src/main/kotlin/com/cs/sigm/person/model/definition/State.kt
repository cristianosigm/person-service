package com.cs.sigm.person.model.definition

enum class State(var country: Country, var state: String) {
    RIO_DE_JANEIRO(Country.BRAZIL, "Rio de Janeiro"),
    SAO_PAULO(Country.BRAZIL, "São Paulo"),

    NEVADA(Country.UNITED_STATES, "Nevada"),
    NEW_YORK(Country.UNITED_STATES, "New York")
}