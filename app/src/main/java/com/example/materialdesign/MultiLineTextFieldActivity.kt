package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_multi_line_text_field.*

class MultiLineTextFieldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_line_text_field)

        showValuesInEditText()
        returnToMainActivity()
    }

    private fun showValuesInEditText() {
        button_show_information_field.setOnClickListener {
            val fieldEditTextMultiline = edit_text_multi_line.text.toString()
            text_view_show_data_multi_line.text = fieldEditTextMultiline.trim()
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