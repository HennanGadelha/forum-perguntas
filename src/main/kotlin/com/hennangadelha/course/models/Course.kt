package com.hennangadelha.course.models

import com.hennangadelha.category.models.Category
import com.hennangadelha.topic.models.Topic
import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
class Course(
    private val name: String,
    @OneToOne
    private val category: Category,
    @OneToMany
    private val topics: List<Topic> = ArrayList(),
) {

    @Id
    @GeneratedValue
    private val id: Long? = null
    private val courseUuid: UUID =  UUID.randomUUID()

}
