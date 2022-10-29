package com.albertoherjim.superheroes.data.biography

import com.google.gson.annotations.SerializedName

data class BiographyApiModel(@SerializedName("fullName") val fullName: String)
