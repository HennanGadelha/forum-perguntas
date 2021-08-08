package com.hennangadelha.category.controller

import com.hennangadelha.category.models.dtos.CategoryRequest
import com.hennangadelha.category.service.CategoryService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*

@Controller("/api/v1/categories")
class RegisterCategory(val categoryService: CategoryService) {

    @Post("/register")
    fun register(@Body categoryRequest: CategoryRequest): HttpResponse<Any> {

        val category = categoryRequest.toModel()
        categoryService.register(category)

        return HttpResponse.created(location(category.categoryUuid))
    }

    private fun location(categoryUuid: UUID) = HttpResponse.uri("/api/v1/categories/$categoryUuid")

}