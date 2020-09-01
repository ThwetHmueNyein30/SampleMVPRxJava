package com.example.samplemvprxapp.network.data_agent

import com.example.samplemvprxapp.network.SampleApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

abstract class BaseDataAgent {

    protected val sampleApi:SampleApi

    init {

     /*   val apiService = Retrofit.Builder()
            .baseUrl("https://api.instantwebtools.net/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        sampleApi=apiService.create(SampleApi::class.java)*/

        val requestInterface = Retrofit.Builder()
            .baseUrl("https://api.nomics.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        sampleApi=requestInterface.create(SampleApi::class.java)
    }

}