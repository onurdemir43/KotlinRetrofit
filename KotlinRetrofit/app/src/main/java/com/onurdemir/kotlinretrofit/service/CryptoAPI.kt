package com.onurdemir.kotlinretrofit.service

import com.onurdemir.kotlinretrofit.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun GetData() : Call<List<CryptoModel>>
}