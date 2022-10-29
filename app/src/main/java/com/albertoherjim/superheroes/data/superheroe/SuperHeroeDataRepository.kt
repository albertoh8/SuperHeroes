package com.albertoherjim.superheroes.data.superheroe

import com.albertoherjim.superheroes.domain.SuperHeroe
import com.albertoherjim.superheroes.domain.SuperHeroeRepository

class SuperHeroeDataRepository(val remoteSource: SuperHeroeRemoteDataSource) :
    SuperHeroeRepository {

    override fun getSuperHeroe(): List<SuperHeroe> {
        return remoteSource.getSuperHeroes()
    }
}