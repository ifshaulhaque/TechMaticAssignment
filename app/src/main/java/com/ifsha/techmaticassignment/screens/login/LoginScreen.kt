package com.ifsha.techmaticassignment.screens.login

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ifsha.techmaticassignment.Constants
import com.ifsha.techmaticassignment.RoutePath

@Composable
fun LoginScreen(
    navController: NavController,
    loginScreenViewModel: LoginScreenViewModel? = hiltViewModel()
) {
    val context = LocalContext.current

    LaunchedEffect(key1 = Unit) {
        val pref = (context as Activity).getPreferences(Context.MODE_PRIVATE)
        val sessionId = pref.getString(Constants.SESSION_ID_KEY, null)
        val userId = pref.getInt(Constants.USER_ID_KEY, -1)

        if (sessionId != null && userId != -1) {
            navController.navigate(RoutePath.PROMOTION_SCREEN_PATH)
        }
    }

    var emailId by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(24.dp)
    ) {
        TextField(
            value = emailId,
            onValueChange = {
                emailId = it
            },
            label = {
                Text(text = "Email Id")
            },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(text = "password")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                loginScreenViewModel?.login(
                    context = context,
                    navController = navController,
                    emailId = emailId,
                    password = password
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }
    }
}