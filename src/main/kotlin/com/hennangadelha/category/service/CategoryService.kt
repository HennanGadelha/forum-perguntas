package com.hennangadelha.category.service

import com.hennangadelha.category.models.Category
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable

import java.util.*

interface CategoryService {

    fun findById(id: UUID): Optional<Category>

    fun findAll(pageable: Pageable): Page<Category>

    fun register (category: Category)

    fun delete (id: UUID)

    fun update (category: Category)




}