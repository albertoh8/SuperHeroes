package com.albertoherjim.superheroes.data.superheroe.remote

import com.albertoherjim.superheroes.data.ApiClient
import com.albertoherjim.superheroes.data.superheroe.toDomain
import com.albertoherjim.superheroes.domain.SuperHeroe

class SuperHeroeRemoteDataSource(val apiClient: ApiClient) {

    fun getSuperHeroes(): List<SuperHeroe> {
        val superHeroes = apiClient.getSuperHeroes()
        return superHeroes.map {
            it.toDomain()
        }
    }
}