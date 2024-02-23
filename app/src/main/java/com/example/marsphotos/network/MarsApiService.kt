package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import retrofit2.http.GET
import retrofit2.http.Query

interface MarsApiService {
    @GET("v1/images/search")
    suspend fun getPhotos(
        @Query("limit") limit: Int = 10,
        @Query("api_key") apiKey: String = "live_paEW7vftbR6QXMlpPWBBwPJkhcuKZcZDU5nOUF9cXdJAPZYkFh6xRPjPAKaLk4qp"
    ): List<MarsPhoto>
}
