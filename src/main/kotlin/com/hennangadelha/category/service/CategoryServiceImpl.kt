package com.hennangadelha.category.service

import com.hennangadelha.category.models.Category
import com.hennangadelha.category.models.repository.CategoryRepository
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import java.util.*
import javax.inject.Singleton

@Singleton
class CategoryServiceImpl(val categoryRepository: CategoryRepository) : CategoryService {

    override fun findById(categoryUuid: UUID): Optional<Category> {
        val category = categoryRepository.findByCategoryUuid(categoryUuid)

        return category
    }

    override fun findAll(pageable: Pageable): Page<Category> {
        return categoryRepository.findAll(pageable)
    }

    override fun register(category: Category) {
        categoryRepository.save(category)
    }

    override fun delete(id: UUID) {
        categoryRepository.deleteByCategoryUuid(id)
    }

    override fun update(category: Category) {

        categoryRepository.update(category)
    }
}