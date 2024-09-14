package com.ifsha.techmaticassignment.network.service

import com.ifsha.techmaticassignment.network.entity.LoginRequestModel
import com.ifsha.techmaticassignment.network.entity.LoginResponseModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("Login/LoginCustomer")
    fun login(@Body loginRequestModel: LoginRequestModel): Call<LoginResponseModel>
}