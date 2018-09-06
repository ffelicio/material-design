package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_single_line_text_field.*

class SingleLineTextFieldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_line_text_field)

        showValuesInEditText()
        returnToMainActivity()
    }

    private fun showValuesInEditText() {
        button_show_information_fields.setOnClickListener {
            val fieldEditTextNormal = editTextNormal.text.toString()
            val fieldEditTextFocus = editTextFocus.text.toString()

            text_view_information_normal.text = fieldEditTextNormal.trim()
            text_view_information_focus.text = fieldEditTextFocus.trim()
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