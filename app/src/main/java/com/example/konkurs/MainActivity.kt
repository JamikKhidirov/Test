package com.example.konkurs

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("Главное актити", "Главное активити создалось")
    }


    override fun onStart() {
        super.onStart()
        Log.d("Главное актити", "Главное активити запустилось")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Главное актити", "Главное активити видна пользователю")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Tag", "Главное активити на паузе")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Главное актити", "Главное активити на стопе")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Главное актити", "Главное активити уничтожилось")
    }
}