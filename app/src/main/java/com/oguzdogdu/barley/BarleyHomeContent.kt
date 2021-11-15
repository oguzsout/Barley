package com.oguzdogdu.barley

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.oguzdogdu.barley.data.DataProvider
import com.oguzdogdu.barley.data.Puppy

@Composable
fun BarleyHomeContent(navigateToProfile: (Puppy) -> Unit) {
    val puppies = remember {
        DataProvider.puppyList
    }
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)) {
        items(items = puppies, itemContent = {
            PuppyListItem(puppy = it,navigateToProfile)
        })
    }
}

