package com.albertoherjim.superheroes.data.work

import com.albertoherjim.superheroes.domain.Work

fun WorkApiModel.toDomain() = Work(this.occupation)