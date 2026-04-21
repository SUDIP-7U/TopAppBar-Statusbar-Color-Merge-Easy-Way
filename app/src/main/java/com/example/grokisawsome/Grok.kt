package com.example.grokisawsome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Honor600ProDesignScreen() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF8F1EB),  // Light beige top
                        Color(0xFFFFE4C4),  // Warm peach/orange bottom
                        Color(0xFFFFB74D)   // Deeper orange accent
                    )
                )
            )
    ) {
        // Abstract flowing shapes (using Box with rounded corners for soft gradient blobs)
        Box(modifier = Modifier.size(400.dp)
                .offset(x = (-120).dp, y = (-80).dp)
                .background(color = Color(0xFFFFE0B2).copy(alpha = 0.7f),
                    shape = RoundedCornerShape(200.dp)
                )
        )

        Box(modifier = Modifier.size(500.dp)
                .offset(x = 100.dp, y = 200.dp).background(
                    color = Color(0xFFFFA726).copy(alpha = 0.6f),
                    shape = RoundedCornerShape(250.dp)
                )
        )
        Column(modifier = Modifier.fillMaxSize()) {
            // Top Navigation Bar
            TopAppBar(
                title = {},
                navigationIcon = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 16.dp)
                    ) {
                        Text(
                            text = "HONOR 600 Pro",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(24.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        Button(
                            onClick = { /* Notify me action */ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                            shape = RoundedCornerShape(50)
                        ) {
                            Text("Notify me", color = Color.White)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                )
            )

            // Hero Content
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 80.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "DESIGN",
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 100.sp
                )
            }
        }

        // Floating Action Buttons (bottom right)
        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 24.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FloatingActionButton(
                onClick = { /* Headphones action */ },
                containerColor = Color.White,
                contentColor = Color.Black,
                shape = CircleShape
            ) {
                Icon(imageVector = Icons.Default.Headphones,
                    contentDescription = "Headphones"
                )
            }

            FloatingActionButton(
                onClick = { /* Scroll up */ },
                containerColor = Color.White,
                contentColor = Color.Black,
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowUpward,
                    contentDescription = "Scroll up"
                )
            }
        }
    }
}