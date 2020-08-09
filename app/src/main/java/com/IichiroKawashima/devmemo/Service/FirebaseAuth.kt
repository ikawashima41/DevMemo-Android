package com.IichiroKawashima.devmemo.Service

import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

object FirebaseAuth {

    fun login(email: String, password: String) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).addOnSuccessListener { result ->
            val user = FirebaseAuth.getInstance().currentUser
        }
    }

    fun logout() {
        FirebaseAuth.getInstance().signOut()
    }
}
