package com.cs.sigm.person.api.v1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/v1/person")
interface PersonResourceV1 {

    @GetMapping("/")
    fun getSample(): String

}