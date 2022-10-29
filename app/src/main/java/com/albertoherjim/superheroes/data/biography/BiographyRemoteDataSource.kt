package com.albertoherjim.superheroes.data.biography

import com.albertoherjim.superheroes.data.ApiClient
import com.albertoherjim.superheroes.domain.Biography


class BiographyRemoteDataSource(private val apiClient: ApiClient) {

    fun getBiography(superHeroeId: Int): Biography? =
        apiClient.getBiography(superHeroeId)?.toDomain()
}