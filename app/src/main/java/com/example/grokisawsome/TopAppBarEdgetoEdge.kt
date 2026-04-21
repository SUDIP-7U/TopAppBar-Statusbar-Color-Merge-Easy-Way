package com.example.grokisawsome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Demo(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("HONOR 600 Pro", fontSize = 33.sp, color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red,           // TopAppBar লাল
                    titleContentColor = Color.White
                ),
              modifier = Modifier.statusBarsPadding()   // স্ট্যাটাস বারের নিচে ঠিকমতো বসবে
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)                    // কন্টেন্ট নিচে নামবে
                .background(Color(0xFFFF9800))            // তোমার অরেঞ্জ/গ্রেডিয়েন্ট ব্যাকগ্রাউন্ড
        ) {
            // তোমার বড় "DESIGN" টেক্সট, আইকন ইত্যাদি এখানে
            Text(
                text = "DESIGN",
                fontSize = 100.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}