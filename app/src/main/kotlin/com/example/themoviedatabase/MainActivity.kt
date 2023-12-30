package com.example.themoviedatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.data.RetrofitServiceFactory
import com.example.themoviedatabase.compose.Greeting
import com.example.themoviedatabase.ui.theme.TheMovieDataBaseTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service =  RetrofitServiceFactory.makeRetrofitService()
        lifecycleScope.launch {
            val movies = service.popularMovieList("edd891c53cdf667feabaf0d0f0db184d", "US")
            println(movies)
        }

        setContent {
            TheMovieDataBaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}