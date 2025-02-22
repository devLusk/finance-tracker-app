package com.github.devlusk.financetracker.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.devlusk.financetracker.ui.theme.FinanceTrackerTheme

@Composable
fun GoalProgressBar(modifier: Modifier, percentage: Float = 1f) {
    Column(modifier = modifier) {
        Text(
            text = "Goal $20,000.00",
            style = MaterialTheme.typography.titleSmall,
            color = Color.Gray
        )
        Box {
            Row {
                Spacer(
                    modifier = Modifier
                        .background(Color.Green, RoundedCornerShape(10.dp))
                        .height(10.dp)
                        .weight(percentage)
                )
                if (percentage < 1f) {
                    Spacer(Modifier.weight(1f - percentage))
                }
            }
            Spacer(
                modifier = Modifier
                    .background(Color.Gray.copy(alpha = .1f), RoundedCornerShape(10.dp))
                    .height(10.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GoalProgressBarPreview() {
    FinanceTrackerTheme {
        GoalProgressBar(modifier = Modifier, percentage = .4f)
    }
}