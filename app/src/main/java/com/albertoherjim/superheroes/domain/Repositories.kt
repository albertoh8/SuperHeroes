package com.albertoherjim.superheroes.domain

interface SuperHeroeRepository {
    fun getSuperHeroe(): List<SuperHeroe>
}

interface BiographyRepository {
    fun getBiography(superHeroeId: Int): Biography
}

interface WorkRepository {
    fun getWork(superHeroeId: Int): Work
}