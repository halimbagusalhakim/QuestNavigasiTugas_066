package com.example.questnavigasitugas_066.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_066.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun home(
    modifier: Modifier = Modifier,
    OnToFormBtnClick : () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF8FABD4))
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            ){
            Text(text = stringResource(R.string.selamat_datang),
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                color = Color(0xFFB56BFF)
            )

        }
    }
}

