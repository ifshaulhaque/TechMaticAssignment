package com.ifsha.techmaticassignment.network.repository

import com.ifsha.techmaticassignment.network.entity.LoginRequestModel
import com.ifsha.techmaticassignment.network.entity.LoginResponseModel
import com.ifsha.techmaticassignment.network.service.ApiService
import retrofit2.Callback
import javax.inject.Inject

class Repository @Inject constructor(
    private val apiService: ApiService
) {
    fun login(loginRequestModel: LoginRequestModel, callback: Callback<LoginResponseModel>) {
        apiService.login(loginRequestModel).enqueue(callback)
    }
}