package com.example.questnavigasitugas_066.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.TextFieldValue
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