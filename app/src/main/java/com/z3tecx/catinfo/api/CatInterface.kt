package com.z3tecx.catinfo.api

import io.reactivex.Observable
import retrofit2.http.GET

interface CatInterface {
    //URL Parameter
    @GET("v1/breeds")
    fun getAllBreeds(): Observable<List<ApiCat>>
}
