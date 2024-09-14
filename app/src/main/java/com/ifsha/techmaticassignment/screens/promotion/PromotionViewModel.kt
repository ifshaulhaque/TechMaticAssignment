package com.ifsha.techmaticassignment.screens.promotion

import androidx.lifecycle.ViewModel
import com.ifsha.techmaticassignment.network.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PromotionViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

}