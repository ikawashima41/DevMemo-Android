package com.IichiroKawashima.devmemo

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthWebException

class MainActivity : AppCompatActivity() {

    private  lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
    }

    override fun onStart() {
        super.onStart()

        val currentUser = auth.currentUser
    }

    fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                } else {
                    Toast.makeText(baseContext, "Authentication failed", Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun logout() {
        FirebaseAuth.getInstance().signOut()
    }
}
