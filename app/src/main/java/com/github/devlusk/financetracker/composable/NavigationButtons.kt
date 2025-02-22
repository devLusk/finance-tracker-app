package com.github.devlusk.financetracker.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.devlusk.financetracker.ui.theme.FinanceTrackerTheme

@Composable
fun NavigationButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(50.dp))
            .padding(20.dp)
            .height(30.dp)
    ) {
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Filled.DateRange,
                contentDescription = "Entry History",
                modifier = Modifier.size(32.dp)
            )
        }

        Spacer(modifier = Modifier.width(34.dp))

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Home",
                modifier = Modifier.size(32.dp)
            )
        }

        Spacer(modifier = Modifier.width(34.dp))

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Filled.Create,
                contentDescription = "Accounts",
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Preview
@Composable
private fun NavigationButtonsPreview() {
    FinanceTrackerTheme {
        NavigationButtons()
    }
}
