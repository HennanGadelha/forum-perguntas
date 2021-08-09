package com.hennangadelha.category.models

import com.hennangadelha.course.models.Course
import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
class Category(
    var name: String,
) {

    @Id
    @GeneratedValue
    val id: Long? = null
    val categoryUuid: UUID =  UUID.randomUUID()
    @OneToMany(fetch = FetchType.EAGER)
    val courses: List<Course> = ArrayList()
}