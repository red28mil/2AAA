
package org.wit.traveldiary


import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.wit.traveldiary.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding;

    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //get layout of page from xml
        setContentView(R.layout.activity_login)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        user = FirebaseAuth.getInstance()
        binding.btnLogin.setOnClickListener{
            registerUser()
            signinUser()
        }
        binding.buttonHome.setOnClickListener{
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.button2.setOnClickListener{
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun registerUser() {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()) {
            user.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(LoginActivity()) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, HomeActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, task.exception!!.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                }

        } else {
            Toast.makeText(this, "blah", Toast.LENGTH_LONG).show()
        }
    }
private fun signinUser()
    {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        if(email.isNotEmpty() && password.isNotEmpty()){


        user.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(this, "success signed IN", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, task.exception!!.message, Toast.LENGTH_SHORT)
                        .show()
                }
            }
                } else {
                Toast.makeText(this, "NOT signed in", Toast.LENGTH_LONG).show()
                }
            }


}