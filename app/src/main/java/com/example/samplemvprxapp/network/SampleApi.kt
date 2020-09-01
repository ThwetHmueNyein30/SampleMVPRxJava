package com.example.samplemvprxapp.network

import com.example.samplemvprxapp.data.vo.RetroCrypto
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SampleApi {

    @GET("prices?key=d1379326b913662ab338b27d4653146b")
    fun getDataFromApi() : Observable<List<RetroCrypto>>

    @GET("passenger")
    fun getDataByPage(@Query("page") page :Int,
                      @Query("size") size:Int)
}