package com.IichiroKawashima.devmemo.Service

import com.IichiroKawashima.devmemo.Entity.User
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

object FireStoresearvice {

    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun postData() {

        val user = User(
            email = "",
            iconUrl = "",
            createdAt = Date(),
            updatedAt = Date()
        )
        db.collection("Users")
            .document()
            .set(user)
            .addOnCompleteListener {

            }
            .addOnSuccessListener {

            }.addOnSuccessListener {

            }

    }
}
