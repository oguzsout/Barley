package com.oguzdogdu.barley

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.oguzdogdu.barley.data.Puppy

@Composable
fun PuppyListItem(puppy: Puppy) {
    Row {
        Column {
            Text(text = puppy.title, style = typography.h6)
            Text(text = "VIEW DETAIL", style = typography.caption)

        }

    }
}