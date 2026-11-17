package com.azapkaan.filmlik.presantation.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.azapkaan.filmlik.presantation.homeScreen.searchSection.SearchSection

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 36.dp, vertical = 36.dp)
    ) {
        SearchSection()
    }
}
