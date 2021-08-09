package com.hennangadelha.category.models.repository

import com.hennangadelha.category.models.Category
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {

     fun findByCategoryUuid(categoryUuid: UUID): Optional<Category>

     fun deleteByCategoryUuid(id: UUID)
}