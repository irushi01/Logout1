package com.example.logout

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val logoutButton = findViewById<Button>(R.id.logout_button)
        val welcomeText = findViewById<TextView>(R.id.welcome_text)

        // Get the email passed from the SignInActivity
        val email = intent.getStringExtra("USER_EMAIL")
        welcomeText.text = "Good Bye !"

        logoutButton.setOnClickListener {
            // Clear the user session and go back to SignInActivity
            finish() // Close HomeActivity
        }
    }
}