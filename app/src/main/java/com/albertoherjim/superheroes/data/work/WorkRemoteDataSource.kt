package com.albertoherjim.superheroes.data.work

import com.albertoherjim.superheroes.data.ApiClient
import com.albertoherjim.superheroes.domain.Work

class WorkRemoteDataSource (private val apiClient: ApiClient) {

    fun getWork(superHeroeId: Int): Work?{
        return apiClient.getWork(superHeroeId)?.toDomain()
    }
}