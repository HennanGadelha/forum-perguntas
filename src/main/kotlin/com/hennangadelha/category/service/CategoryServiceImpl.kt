package com.hennangadelha.category.service

import com.hennangadelha.category.models.Category
import com.hennangadelha.category.models.repository.CategoryRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class CategoryServiceImpl(val categoryRepository: CategoryRepository) : CategoryService {

    override fun findById(categoryUuid: UUID): Optional<Category> {
        val category = categoryRepository.findByCategoryUuid(categoryUuid)

        return category
    }

    override fun findAll(): List<Category> {
        return categoryRepository.findAll()
    }

    override fun register(category: Category) {
        categoryRepository.save(category)
    }

    override fun delete(id: UUID) {
        categoryRepository.deleteByCategoryUuid(id)
    }
}