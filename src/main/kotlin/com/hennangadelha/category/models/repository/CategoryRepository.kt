package com.hennangadelha.category.models.repository

import com.hennangadelha.category.models.Category
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {
}