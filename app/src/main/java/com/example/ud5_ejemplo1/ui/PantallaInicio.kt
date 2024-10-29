package com.example.ud5_ejemplo1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.ud5_ejemplo1.R

@Composable
fun PantallaInicio(
    onBotonSiguientePulsado: () -> Unit,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(id = R.string.inicio),
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.weight(1F))

        Button(onClick = onBotonSiguientePulsado) {
            Text(
                text = stringResource(R.string.siguiente)
            )
        }

    }
}