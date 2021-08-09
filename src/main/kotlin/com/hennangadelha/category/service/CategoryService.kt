package com.hennangadelha.category.service

import com.hennangadelha.category.models.Category
import java.util.*

interface CategoryService {

    fun findById(id: UUID): Optional<Category>

    fun findAll(): List<Category>

    fun register (category: Category)

    fun delete (id: UUID)
//
//    fun update (categoryUuiD: UUID, category: Category)




}