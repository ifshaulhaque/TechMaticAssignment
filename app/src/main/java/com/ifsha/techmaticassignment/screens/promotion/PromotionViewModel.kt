package com.ifsha.techmaticassignment.screens.promotion

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ifsha.techmaticassignment.Constants
import com.ifsha.techmaticassignment.network.entity.PromotionList
import com.ifsha.techmaticassignment.network.entity.PromotionRequestModel
import com.ifsha.techmaticassignment.network.entity.PromotionResponseModel
import com.ifsha.techmaticassignment.network.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PromotionViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    val promotionList = mutableStateOf(emptyList<PromotionList>())

    fun getPromotions(
        context: Context
    ) {
        val pref = (context as Activity).getPreferences(Context.MODE_PRIVATE)
        val sessionId = pref.getString(Constants.SESSION_ID_KEY, null)
        val userId = pref.getInt(Constants.USER_ID_KEY, -1)

        if (sessionId != null && userId != -1) {
            repository.getPromotions(
                PromotionRequestModel(
                    SessionId = sessionId,
                    UserId = userId
                ),
                object: Callback<PromotionResponseModel> {
                    override fun onResponse(
                        p0: Call<PromotionResponseModel>,
                        p1: Response<PromotionResponseModel>
                    ) {
                        promotionList.value = p1.body()?.PromotionList ?: emptyList()
                    }

                    override fun onFailure(p0: Call<PromotionResponseModel>, p1: Throwable) {
                        Log.e("API Error", p1.message.toString())
                    }

                }
            )
        }
    }
}