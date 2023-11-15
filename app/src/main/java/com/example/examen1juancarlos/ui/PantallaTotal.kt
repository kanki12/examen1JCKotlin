package com.example.examen1juancarlos.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.examen1juancarlos.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun sumador(num1: Int, num2: Int, modifier: Modifier = Modifier) {
    var total = num1 + num2
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            TextField(
                value = num1.toString() + " " + num2.toString() + " = " + total,
                onValueChange = {},
                label = R.string.total
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
    }
}