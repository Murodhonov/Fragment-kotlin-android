package com.example.fragmentkotlinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener {
            val blankFragment = BlankFragment()
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.add(R.id.my_fragment_host, blankFragment)
            transaction.addToBackStack(blankFragment.toString())
            transaction.commit()
        }
        btn_replace.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            val blankFragment2 = BlankFragment2()
            transaction.replace(R.id.my_fragment_host, blankFragment2)
            transaction.addToBackStack(blankFragment2.toString())
            transaction.commit()
        }
    }
}