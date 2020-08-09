package com.IichiroKawashima.devmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.IichiroKawashima.devmemo.Entity.User
import com.google.android.material.tabs.TabLayout
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class HomeActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        db = FirebaseFirestore.getInstance()
    }

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
