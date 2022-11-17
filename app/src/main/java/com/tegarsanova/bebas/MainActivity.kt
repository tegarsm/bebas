package com.tegarsanova.bebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.sythetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get().load(path: "https://picsum.photos/id/237/200/300").fit().conterCrop().into(ivPhoto)
    }
}