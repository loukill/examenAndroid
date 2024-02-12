package tn.esprit.examenandroid.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import tn.esprit.examenandroid.models.User

interface ApiService {

    @POST("login")
    fun login(@Body user: User): Call<User>
}