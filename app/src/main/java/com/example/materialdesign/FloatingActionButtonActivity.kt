package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_floating_action_button.*

class FloatingActionButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

        callIntentTextField()
    }

    private fun callIntentTextField() {
        floatingActionButton.setOnClickListener {
            val intent = Intent(this@FloatingActionButtonActivity, SingleLineTextFieldActivity::class.java)
            startActivity(intent)
        }
    }
}