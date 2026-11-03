package com.azapkaan.filmlik.presantation.locationSelectScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.Button
import androidx.tv.material3.ButtonDefaults
import androidx.tv.material3.Glow
import com.azapkaan.filmlik.ui.theme.BusinessBlack
import com.azapkaan.filmlik.ui.theme.DesertStorm
import com.azapkaan.filmlik.ui.theme.SensationalBlack

@Composable
fun LocationSelectScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(SensationalBlack)
            .drawWithCache {
                val lightOrigin = Offset(
                    x = size.width / 2f,
                    y = size.height * 0.62f
                )
                val upwardBeam = Brush.sweepGradient(
                    colorStops = arrayOf(
                        0.0f to Color.Transparent,
                        0.58f to Color.Transparent,
                        0.68f to Color(0x164A7DFF),
                        0.75f to Color(0x264A7DFF),
                        0.82f to Color(0x164A7DFF),
                        0.92f to Color.Transparent,
                        1.0f to Color.Transparent
                    ),
                    center = lightOrigin
                )

                onDrawBehind {
                    drawRect(
                        brush = upwardBeam,
                        blendMode = BlendMode.Plus
                    )
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .clip(shape = RoundedCornerShape(20))
                .border(
                    width = 2.dp,
                    color = Color.White.copy(alpha = 0.12F),
                    shape = RoundedCornerShape(20)
                )
                .background(color = BusinessBlack)
                .padding(vertical = 68.dp, horizontal = 74.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ) {
            Icon(
                modifier = Modifier.size(72.dp),
                imageVector = Icons.Filled.Movie,
                contentDescription = null,
                tint = DesertStorm,
            )

            SelectButton()
        }
    }
}

@Composable
private fun SelectButton() {
    Button(
        modifier = Modifier
            .width(500.dp)
            .height(124.dp)
            .padding(40.dp),
        onClick = {},
        colors = ButtonDefaults.colors(
            containerColor = DesertStorm,
            contentColor = Color.Black,

        ),
        glow = ButtonDefaults.glow(
            glow = Glow.None,
            focusedGlow = Glow(
                elevationColor = Color.Red,
                elevation = 16.dp
            )
        )

    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Folder,
                contentDescription = null,
                modifier = Modifier.size(54.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Select Movies Location",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
