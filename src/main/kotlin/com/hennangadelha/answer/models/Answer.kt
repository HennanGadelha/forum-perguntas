package com.hennangadelha.answer.models

import com.hennangadelha.topic.models.Topic
import com.hennangadelha.user.models.Student
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
class Answer(private val message: String,
             @OneToOne
             private  val author: Student,
             @ManyToOne
             private val topic: Topic
             ) {

    @Id
    @GeneratedValue
    private val id: Long? = null
    private val answerUuid = UUID.randomUUID()
    private val createdAt: LocalDateTime = LocalDateTime.now()
    private val solution: Boolean = false
}