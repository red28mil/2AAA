package org.wit.traveldiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import org.wit.traveldiary.databinding.ActivityLogoutBinding

private lateinit var binding: ActivityLogoutBinding;

private lateinit var user: FirebaseAuth


class LogoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        user = FirebaseAuth.getInstance()
        if(user.currentUser != null){
            user.currentUser?.let { binding.tvUserEmail.text = it.email
            }


        }

    binding.btnSignOut.setOnClickListener{
        user.signOut()
        startActivity(
            Intent(this, MainActivity::class.java)
            )
            finish()
}
    }
}