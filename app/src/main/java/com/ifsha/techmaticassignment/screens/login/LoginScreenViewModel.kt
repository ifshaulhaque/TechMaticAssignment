package com.ifsha.techmaticassignment.screens.login

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginScreenViewModel @Inject constructor(): ViewModel() {
    fun login(
        navController: NavController,
        emailId: String,
        password: String
    ) {

    }
}