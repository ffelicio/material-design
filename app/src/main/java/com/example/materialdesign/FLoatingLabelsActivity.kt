package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_multi_line_text_field.*

class FLoatingLabelsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_labels)

        returnToMainActivity()
    }

    private fun returnToMainActivity() {
        button_call_activity_main.setOnClickListener {
            Toast.makeText(this, "Retornando para a tela inicial", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}