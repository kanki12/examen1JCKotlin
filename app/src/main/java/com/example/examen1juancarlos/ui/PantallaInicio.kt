package com.example.examen1juancarlos.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.examen1juancarlos.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun inicio(modifier: Modifier = Modifier) {
    var numero1 by remember { mutableStateOf(TextFieldValue("")) }
    var numero2 by remember { mutableStateOf(TextFieldValue("")) }

    Column {
        TextField(
            value = numero1,
            onValueChange = { numero1 = it },
            label = Text(text = stringResource(id = R.string.label1))
        )
        Spacer(modifier = Modifier.width(8.dp))
        TextField(
            value = numero2,
            onValueChange = { numero2 = it },
            label = Text(text = stringResource(id = R.string.label2))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = {
            if (numero1 != null && numero2 != null) {

            }
        }) {
            Text(text = stringResource(id = R.string.sumador))
        }
    }
}
