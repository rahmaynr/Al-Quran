package com.rahmayuniar.myprayschedule.networking

import retrofit2.http.GET
import com.rahmayuniar.myprayschedule.model.main.ModelSurah
import com.rahmayuniar.myprayschedule.model.main.ModelAyat
import com.rahmayuniar.myprayschedule.model.response.ModelResultNearby
import retrofit2.Call
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.ArrayList


interface ApiInterface {
    @GET("/99c279bb173a6e28359c/data")
    fun getListSurah(): Call<ArrayList<ModelSurah>>

    @GET("/99c279bb173a6e28359c/surat/{nomor}")
    fun getDetailSurah(
        @Path("nomor") nomor: String
    ): Call<ArrayList<ModelAyat>>

    @GET("place/nearbysearch/json")
    fun getDataResult(
        @Query("key") key: String,
        @Query("keyword") keyword: String,
        @Query("location") location: String,
        @Query("rankby") rankby: String
    ): Call<ModelResultNearby>
}