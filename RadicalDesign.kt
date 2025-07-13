package com.cleanarch.trial

import android.graphics.Color
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush

@Composable
fun RadialDesign(
        center: Offset,
        radius: Float = 300f,
        colors: List<Color>,
        modifier: Modifier = Modifier.fillMaxSize()
) {
    Canvas(modifier = modifier) {
        drawCircle(
                brush = Brush.radialGradient(colors = colors, radius = radius, center = center),
                radius = radius,
                center = center
        )
    }
}
