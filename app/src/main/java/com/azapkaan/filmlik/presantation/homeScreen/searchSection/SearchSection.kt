package com.azapkaan.filmlik.presantation.homeScreen.searchSection

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.Icon
import androidx.tv.material3.IconButton
import androidx.tv.material3.IconButtonDefaults
import androidx.tv.material3.Text
import com.azapkaan.filmlik.ui.theme.DesertStorm
import com.azapkaan.filmlik.ui.theme.GoldenCape

@Composable
fun SearchSection(modifier: Modifier = Modifier) {
    var state by rememberSaveable { mutableStateOf("") }

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start)
    ) {
        OutlinedTextField(
            value = state,
            modifier = Modifier.size(width = 340.dp, height = 58.dp),
            onValueChange = {
                state = it
            },
            shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.White.copy(alpha = 0.24f),
                focusedBorderColor = DesertStorm,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                cursorColor = Color.Transparent,

            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            },
            placeholder = {
                Text(
                    text = "Film ara",
                    fontSize = 20.sp,
                    color = Color.White
                )
            },
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 20.sp
            ),

        )

        IconButton(
            onClick = {
            },
            modifier = Modifier
                .size(58.dp)
                .border(
                    width = 1.dp,
                    shape = CircleShape,
                    color = Color.White.copy(alpha = 0.24f)
                ),
            colors = IconButtonDefaults.colors(
                containerColor = Color.Transparent,
                pressedContainerColor = GoldenCape,
                contentColor = DesertStorm,
                pressedContentColor = DesertStorm
            )

        ) {
            Icon(
                imageVector = Icons.Default.Mic,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
