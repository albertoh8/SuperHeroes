package com.albertoherjim.superheroes.data.superheroe.local

import com.albertoherjim.superheroes.domain.SuperHeroe

interface SuperHeroeLocalDataSource {
    fun save(superHeroes: List<SuperHeroe>)
    fun getHeroes(): List<SuperHeroe>
}