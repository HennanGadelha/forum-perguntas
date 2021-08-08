package com.hennangadelha.category.models.dtos

import com.hennangadelha.category.models.Category
import io.micronaut.core.annotation.Introspected

@Introspected
data class CategoryRequest(private val name: String){

    fun toModel() : Category {
       return  Category(this.name)
    }

}
