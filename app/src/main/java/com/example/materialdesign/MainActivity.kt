package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        callIntentFloatingActionButton()
        callIntentSingleLineTextField()
        callIntentMultiLineTextField()
        callIntentFullWidthTextField()
    }

    // Chamando a activity com a referência Floating Action Button
    private fun callIntentFloatingActionButton() {
        button_call_activity_floating_action_button.setOnClickListener {
            val intent = Intent(this, FloatingActionButtonActivity::class.java)
            startActivity(intent)
        }
    }

    private fun callIntentSingleLineTextField() {
        button_call_activity_single_line_text_field.setOnClickListener {
            val intent = Intent(this, SingleLineTextFieldActivity::class.java)
            startActivity(intent)
        }
    }

    private fun callIntentMultiLineTextField() {
        button_call_activity_multi_line_text_field.setOnClickListener {
            val intent = Intent(this, MultiLineTextFieldActivity::class.java)
            startActivity(intent)
        }
    }

    private fun callIntentFullWidthTextField() {
        button_call_activity_full_width_text_field.setOnClickListener {
            val intent = Intent(this, FullWidthTextField::class.java)
            startActivity(intent)
        }
    }
}