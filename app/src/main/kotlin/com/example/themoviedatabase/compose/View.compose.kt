package com.example.themoviedatabase.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themoviedatabase.ui.theme.TheMovieDataBaseTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {

        Text(
            text = name,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true, name = "regularView", fontScale = 2f)
@Composable
fun Preview() {
    TheMovieDataBaseTheme {
        Greeting("Android")
    }
}