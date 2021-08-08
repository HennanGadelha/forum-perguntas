package com.hennangadelha.user.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Student(private val name: String, private val email: String) {

    @Id
    @GeneratedValue
    private val id: Long? = null
    private val userUuid: UUID =  UUID.randomUUID()

}
