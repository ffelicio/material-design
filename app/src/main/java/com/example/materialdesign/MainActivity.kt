package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callIntentFloatingActionButton()
    }

    // Chamando a activity com a referência Floating Action Button
    private fun callIntentFloatingActionButton() {
        button_call_intent_button_fab.setOnClickListener {
            val intent = Intent(this@MainActivity, FloatingActionButtonActivity::class.java)
            startActivity(intent)
        }
    }
}