package com.ifsha.techmaticassignment

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ifsha.techmaticassignment.screens.login.LoginScreen
import com.ifsha.techmaticassignment.screens.promotion.PromotionScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = RoutePath.LOGIN_SCREEN_PATH) {
        composable(
            route = RoutePath.LOGIN_SCREEN_PATH
        ) {
            LoginScreen(navController = navHostController)
        }

        composable(
            route = RoutePath.PROMOTION_SCREEN_PATH
        ) {
            PromotionScreen(navController = navHostController)
        }
    }
}

object RoutePath {
    const val LOGIN_SCREEN_PATH = "loginScreenPath"
    const val PROMOTION_SCREEN_PATH = "promotionScreenPath"
}