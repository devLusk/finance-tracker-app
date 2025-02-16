package com.example.financetracker.features.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NavigationButtons(modifier: Modifier = Modifier) {
    // TODO: Arredondar os Buttons, deixar mais redondo
    Row(
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(40.dp))
            .padding(20.dp)
    ) {
        Button(onClick = {}) {
            Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Entry History")
        }
        Spacer(modifier = Modifier.width(34.dp))
        Button(onClick = {}) {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
        }
        Spacer(modifier = Modifier.width(34.dp))
        Button(onClick = {}) {
            Icon(imageVector = Icons.Filled.Create, contentDescription = "Accounts")
        }
    }
}

@Preview
@Composable
private fun NavigationButtonsPreview() {
    NavigationButtons()
}
