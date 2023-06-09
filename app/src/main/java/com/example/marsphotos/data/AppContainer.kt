package com.example.marsphotos.data
import retrofit2.Retrofit
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import com.example.marsphotos.network.MarsApiService

interface AppContainer {
    val marsPhotosRepository : MarsPhotosRepository}

class DefaultAppContainer {
    private val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: override val marsPhotosRepository: MarsPhotosRepository by lazy {
        DefaultMarsPhotosRepository(retrofitService)
    }
}

class DefaultMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : return marsApiService.getPhotos()









}

