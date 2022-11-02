package com.albertoherjim.superheroes.data.superheroe.local.xml

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.albertoherjim.superheroes.data.superheroe.local.SuperHeroeLocalDataSource
import com.albertoherjim.superheroes.domain.SuperHeroe
import com.google.gson.Gson

class SuperHeroeXmlLocalDataSource(val activity: Activity, sharedPreferences: SharedPreferences) :
    SuperHeroeLocalDataSource {
    private val editor = sharedPreferences.edit()
    private val gson = Gson()

    val sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)


    override fun save(superHeroes: List<SuperHeroe>) {
        val editor = sharedPreferences.edit()
        superHeroes.forEach { superHeroe ->
            editor.putString(superHeroe.id.toString(), gson.toJson(superHeroe))
        }
        editor.apply()
    }

    override fun getHeroes(): List<SuperHeroe> {
        val superHeroes: MutableList<SuperHeroe> = mutableListOf()
        sharedPreferences.all.forEach { map ->
            superHeroes.add(gson.fromJson(map.value as String, SuperHeroe::class.java))
        }
        return superHeroes
    }
}