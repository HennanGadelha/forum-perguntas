package com.hennangadelha.category.controller

import com.hennangadelha.category.models.dtos.CategoryResponse
import com.hennangadelha.category.service.CategoryService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import java.util.*

@Controller("/api/v1/categories")
class DeleteCategory(val categoryService: CategoryService) {

    @Delete("/{categoryUuid}")
    fun findById( categoryUuid: UUID): HttpResponse<Any> {

        val category = categoryService.findById(categoryUuid)
        if(category.isEmpty)
            return HttpResponse.notFound()

        return HttpResponse.ok(categoryService.delete(category.get().categoryUuid))
    }


}