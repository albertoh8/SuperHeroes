package com.albertoherjim.superheroes.data.biography

import com.albertoherjim.superheroes.domain.Biography

fun BiographyApiModel.toDomain() = Biography(this.fullName)

