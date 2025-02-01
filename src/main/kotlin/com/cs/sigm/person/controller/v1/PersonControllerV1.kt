package com.cs.sigm.person.controller.v1

import com.cs.sigm.person.api.v1.PersonResourceV1
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonControllerV1 : PersonResourceV1 {

    override fun getSample(): String {
        return "Replace me with service call"
    }
}