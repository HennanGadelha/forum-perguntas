package com.hennangadelha.category.controller

import com.hennangadelha.category.models.dtos.CategoryResponse
import com.hennangadelha.category.service.CategoryService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.*

@Controller("/api/v1/categories")
class FindById(val categoryService: CategoryService) {

    @Get("/{categoryUuid}")
    fun findById( categoryUuid: UUID): HttpResponse<CategoryResponse>{

        val category = categoryService.findById(categoryUuid)
        if(category.isEmpty)
             return HttpResponse.notFound()

        return HttpResponse.ok(CategoryResponse(category.get().name))
    }

}