package com.albertoherjim.superheroes.data

import com.albertoherjim.superheroes.data.biography.BiographyApiModel
import com.albertoherjim.superheroes.data.superheroe.SuperHeroeApiModel
import com.albertoherjim.superheroes.data.work.WorkApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {
    @GET("all.json")
    fun getSuperHeroesFeed(): Call<List<SuperHeroeApiModel>>

    @GET("biography/{heroId}.json")
    fun getBiography(@Path("heroId") heroId: Int): Call<BiographyApiModel>

    @GET("work/{heroId}.json")
    fun getWork(@Path("heroId") heroId: Int): Call<WorkApiModel>
}