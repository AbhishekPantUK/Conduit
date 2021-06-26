package io.realworld.conduit.api.services

import io.realworld.conduit.api.models.responses.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ConduitApi {

    @GET("articles")
    fun getArticles() : Call<ArticlesResponse>

}