package com.ifsha.techmaticassignment.screens.promotion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage

@Composable
fun PromotionScreen(
    navController: NavController,
    promotionViewModel: PromotionViewModel? = hiltViewModel()
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = Unit) {
        promotionViewModel?.getPromotions(context)
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .padding(
                top = 24.dp,
                end = 24.dp,
                start = 24.dp
            )
            .verticalScroll(
                state = rememberScrollState()
            )
    ) {
        promotionViewModel?.promotionList?.value?.forEach { promotion ->
            Card {
                Column {
                    AsyncImage(
                        contentScale = ContentScale.Crop,
                        model = promotion.Url,
                        contentDescription = "promotionalimage",
                        modifier = Modifier.fillMaxWidth()
                    )

                    ListItem(
                        headlineContent = { Text(text = promotion.Title )},
                        supportingContent = { Text(text = "${promotion.EventStartDt} - ${promotion.EventEndDt}") },
                    )
                }
            }

        }
    }
}