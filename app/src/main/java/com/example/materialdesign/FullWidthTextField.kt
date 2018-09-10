package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_full_width_text_field.*

class FullWidthTextField : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_width_text_field)

        showValueFullWidthEditTextInTextField()
        returnToMainActivity()
    }

    private fun showValueFullWidthEditTextInTextField() {
        button_show_information_field.setOnClickListener {
            val fieldFullWidthEditText = full_width_edit_text.text.toString()
            text_view_full_width_text.text = fieldFullWidthEditText.trim()
        }
    }

    private fun returnToMainActivity() {
        button_call_activity_main.setOnClickListener {
            Toast.makeText(this, "Retornando para a tela inicial", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
