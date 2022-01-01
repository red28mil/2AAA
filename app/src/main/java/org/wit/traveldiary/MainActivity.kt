package org.wit.traveldiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        val button = findViewById<Button>(R.id.button)
// set on-click listener
        button.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
           


        }
    }
}
