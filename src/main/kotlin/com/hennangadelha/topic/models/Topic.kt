package com.hennangadelha.topic.models

import com.hennangadelha.answer.models.Answer
import com.hennangadelha.course.models.Course
import com.hennangadelha.user.models.Student
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
class Topic(
    private val title: String,
    private val message: String,
    @OneToOne
    private val course: Course,
    @OneToOne
    private val author: Student,
    @OneToMany
    private val answers:  List<Answer> = ArrayList()
) {

    @Id
    @GeneratedValue
    private val id: Long? = null
    private val topicUuid = UUID.randomUUID()
    private val createdAt:  LocalDateTime = LocalDateTime.now()
    private val status: Status = Status.NOT_ANSWERED

}