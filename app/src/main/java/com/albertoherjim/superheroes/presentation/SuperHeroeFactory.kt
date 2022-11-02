package com.albertoherjim.superheroes.presentation

import com.albertoherjim.superheroes.data.ApiClient
import com.albertoherjim.superheroes.data.biography.BiographyDataRepository
import com.albertoherjim.superheroes.data.biography.BiographyRemoteDataSource
import com.albertoherjim.superheroes.data.superheroe.remote.SuperHeroeDataRepository
import com.albertoherjim.superheroes.data.superheroe.remote.SuperHeroeRemoteDataSource
import com.albertoherjim.superheroes.data.work.WorkDataRepository
import com.albertoherjim.superheroes.data.work.WorkRemoteDataSource
import com.albertoherjim.superheroes.domain.GetSuperHeroeFeedUseCase

class SuperHeroeFactory {

    fun getSuperHeroeUseCase(): GetSuperHeroeFeedUseCase {
        val apiClient = ApiClient()
        return GetSuperHeroeFeedUseCase(
            SuperHeroeDataRepository(SuperHeroeRemoteDataSource(apiClient)),
            BiographyDataRepository(BiographyRemoteDataSource(apiClient)),
            WorkDataRepository(WorkRemoteDataSource(apiClient)),
        )
    }

}