package com.ifsha.techmaticassignment.screens.login

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.ifsha.techmaticassignment.Constants
import com.ifsha.techmaticassignment.RoutePath
import com.ifsha.techmaticassignment.network.entity.LoginRequestModel
import com.ifsha.techmaticassignment.network.entity.LoginResponseModel
import com.ifsha.techmaticassignment.network.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class LoginScreenViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {
    fun login(
        context: Context,
        navController: NavController,
        emailId: String,
        password: String
    ) {
        repository.login(
            LoginRequestModel(
                EmailId = emailId,
                Password = password
            ),
            object: Callback<LoginResponseModel> {
                override fun onResponse(
                    p0: Call<LoginResponseModel>,
                    p1: Response<LoginResponseModel>
                ) {
                    p1.body()?.let { body ->
                        val pref = (context as Activity).getPreferences(Context.MODE_PRIVATE)
                        pref.edit().apply {
                            putString(Constants.SESSION_ID_KEY, body.SessionId)
                            putInt(Constants.USER_ID_KEY, body.UserId)
                            apply()
                        }
                        navController.navigate(RoutePath.PROMOTION_SCREEN_PATH)
                    }
                }

                override fun onFailure(p0: Call<LoginResponseModel>, p1: Throwable) {
                    Log.e("API error", p1.message.toString())
                }
            }
        )
    }
}