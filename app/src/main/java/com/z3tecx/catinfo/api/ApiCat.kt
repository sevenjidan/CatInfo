package com.z3tecx.catinfo.api

import com.google.gson.annotations.SerializedName

data class ApiCat (
    @SerializedName("name") val name: String,
    @SerializedName("origin") val origin: String

)