package com.hennangadelha.category.controller

import com.hennangadelha.category.models.dtos.CategoryResponse
import com.hennangadelha.category.service.CategoryService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/categories")
class ListAll(val categoryService: CategoryService) {

    @Get
    fun listAll(): HttpResponse<List<CategoryResponse>>{

        val categories: List<CategoryResponse>  =
            categoryService.findAll().map { CategoryResponse(it.name) }

        return  HttpResponse.ok(categories)

    }

}