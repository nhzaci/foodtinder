package com.example.foodtinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun searchPostalCode(view: View) {
        val intent = Intent(this, Main2Activity::class.java)
        //val postalCodeInput = findViewById(R.id.postalCodeInput)
        //having issues putting extra in kotlin...
        //intent.putExtra("postalCode", postalCodeInput.getText())
        startActivity(intent) //goes to second activity page
    }
}
