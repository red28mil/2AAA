
package org.wit.traveldiary


import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {

    lateinit var auth : FirebaseAuth

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

        val buttonHome = findViewById<Button>(R.id.buttonHome)
        // set on-click listener
        buttonHome.setOnClickListener {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}