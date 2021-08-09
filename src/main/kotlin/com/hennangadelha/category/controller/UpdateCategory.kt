package com.hennangadelha.category.controller

import com.hennangadelha.category.models.dtos.CategoryRequest
import com.hennangadelha.category.models.dtos.CategoryResponse
import com.hennangadelha.category.service.CategoryService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Put
import java.util.*

@Controller("/api/v1/categories")
class UpdateCategory(val categoryService: CategoryService) {


    @Put("/{categoryUuid}")
    fun update(categoryUuid: UUID, @Body request: CategoryRequest) : HttpResponse<Any>{

        var category = categoryService.findById(categoryUuid)
        if(category.isEmpty)
            return HttpResponse.notFound()

        category.get().name = request.name

        categoryService.update(category.get())

        return HttpResponse.ok(CategoryResponse(category.get().name))

    }

}