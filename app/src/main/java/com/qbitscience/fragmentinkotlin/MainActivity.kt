package com.qbitscience.fragmentinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button:Button=findViewById(R.id.button)
        button.setOnClickListener {
           var fragmentManager:FragmentManager=supportFragmentManager
            var fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.main_container,FirstFragment())
            fragmentTransaction.commit()
        }
    }
}