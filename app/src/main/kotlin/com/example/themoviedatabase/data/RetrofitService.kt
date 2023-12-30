package com.example.myapplication.data

import com.example.myapplication.data.model.RemoteResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("discover/movie?sort_by=popularity.desc")
    suspend fun popularMovieList(
        @Query("api_key") apiKey: String,
        @Query("region") region: String,
    ): RemoteResult
}

object RetrofitServiceFactory {

    fun makeRetrofitService(): RetrofitService =
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)

}
