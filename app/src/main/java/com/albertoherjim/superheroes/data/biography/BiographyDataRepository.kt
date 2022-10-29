package com.albertoherjim.superheroes.data.biography

import com.albertoherjim.superheroes.domain.Biography
import com.albertoherjim.superheroes.domain.BiographyRepository

class BiographyDataRepository(val remoteDataSource: BiographyRemoteDataSource) :
    BiographyRepository {

    override fun getBiography(superHeroeId: Int): Biography {
        return remoteDataSource.getBiography(superHeroeId) ?: Biography("test")
    }
}