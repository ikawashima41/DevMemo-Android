package com.IichiroKawashima.devmemo.Service

import com.google.firebase.auth.FirebaseAuth

object FirebaseAuth {

    private val auth = FirebaseAuth.getInstance()

    fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener { result ->
            val user = auth.currentUser

        }
    }

    fun logout() {
        auth.signOut()
    }
}
