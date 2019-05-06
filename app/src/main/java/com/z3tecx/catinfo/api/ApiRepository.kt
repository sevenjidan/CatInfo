package com.z3tecx.catinfo.api

import com.google.gson.Gson
import com.z3tecx.catinfo.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//class ApiRepository {
//     var BASE_URL: String = "https://www.api.thecatapi.com/"
//     var retrofit: Retrofit? = null
//
//    fun getApiRepository(): Retrofit? {
//        if (retrofit == null) {
//            retrofit = Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create()).build()
//        }
//        return retrofit
//    }
//}