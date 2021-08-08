package com.hennangadelha.category.service

import com.hennangadelha.category.models.Category
import com.hennangadelha.category.models.repository.CategoryRepository
import javax.inject.Singleton

@Singleton
class CategoryServiceImpl(val categoryRepository: CategoryRepository) : CategoryService {

    override fun register(category: Category) {
        categoryRepository.save(category)
    }
}