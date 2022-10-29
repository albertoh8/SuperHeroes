package com.albertoherjim.superheroes.data.work

import com.albertoherjim.superheroes.domain.Work
import com.albertoherjim.superheroes.domain.WorkRepository

class WorkDataRepository(val remoteDataSource: WorkRemoteDataSource) :
    WorkRepository {

    override fun getWork(superHeroeId: Int): Work {
        return remoteDataSource.getWork(superHeroeId) ?: Work("Programador")
    }
}