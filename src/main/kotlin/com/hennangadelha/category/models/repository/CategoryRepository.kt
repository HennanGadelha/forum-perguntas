package com.hennangadelha.category.models.repository

import com.hennangadelha.category.models.Category
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.data.model.Page
import java.awt.print.Pageable
import java.util.*

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {

     fun findByCategoryUuid(categoryUuid: UUID): Optional<Category>

     fun deleteByCategoryUuid(id: UUID)


}