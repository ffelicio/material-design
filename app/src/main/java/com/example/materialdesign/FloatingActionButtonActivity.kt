package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_floating_action_button.*

class FloatingActionButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

        showToastInFloatButtonClick()
        callIntentMain()
    }

    private fun showToastInFloatButtonClick() {
        floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Clicando no botão float action button", Toast.LENGTH_SHORT).show()
        }
    }

    private fun callIntentMain() {
        button_call_activity_main.setOnClickListener {
            Toast.makeText(this, "Retornando para a tela inicial", Toast.LENGTH_SHORT).show()

            val intent =  Intent(this,  MainActivity::class.java)
            startActivity(intent)
        }
    }
}