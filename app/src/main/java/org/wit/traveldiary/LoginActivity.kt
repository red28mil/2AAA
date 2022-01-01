
package org.wit.traveldiary


import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity



class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //get layout of page from xml
        setContentView(R.layout.activity_login)
        val button2 = findViewById<Button>(R.id.button2)
        // set on-click listener
        button2.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}