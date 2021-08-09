package com.hennangadelha.category.controller

import com.hennangadelha.category.models.Category
import com.hennangadelha.category.models.dtos.CategoryResponse
import com.hennangadelha.category.models.repository.CategoryRepository
import com.hennangadelha.category.service.CategoryService
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/categories")
class ListAll(val categoryService: CategoryService, val categoryRepository: CategoryRepository) {


    @Get
    fun findAll(pageable: Pageable): HttpResponse<Page<CategoryResponse>> {

        val categories = categoryService.findAll(pageable).map { CategoryResponse(it.name) }

        return HttpResponse.ok(categories)

    }


}