package com.chirag.tracking.network

import com.chirag.tracking.network.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET(Endpoints.GET_JOKES)
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Endpoints.KEY_API
    ): Response<NewsResponse>
}