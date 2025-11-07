package com.example.questnavigasitugas_066.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.questnavigasitugas_066.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormulirPendaftaran(
    onSubmitButtonClick: () -> Unit,
    modifier: Modifier = Modifier){
    var nama by remember { mutableStateOf(TextFieldValue("")) }
    var alamat by remember { mutableStateOf(TextFieldValue("")) }
    var jenisKelamin by remember { mutableStateOf("") }
    var statusPerkawinan by remember { mutableStateOf("") }

    val paddingSmall = dimensionResource(id = R.dimen.padding_smallform)
    val paddingMedium = dimensionResource(id = R.dimen.padding_mediumform)
    val paddingLarge = dimensionResource(id = R.dimen.padding_largeform)
    val buttonHeight = dimensionResource(id = R.dimen.button_heightform)

    Surface(
        color = Color(0xFFF6ECFF),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

        }

