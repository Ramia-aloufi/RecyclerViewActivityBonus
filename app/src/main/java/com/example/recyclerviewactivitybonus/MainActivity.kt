package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var et3:EditText
    lateinit var et4:EditText
    lateinit var btn1:Button
    lateinit var al:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1  = findViewById(R.id.editTextTextPersonName)
        et2  = findViewById(R.id.editTextTextPersonName2)
        et3  = findViewById(R.id.editTextTextPersonName3)
        et4  = findViewById(R.id.editTextTextPersonName4)

        btn1 = findViewById(R.id.button)

        al = arrayListOf()

        btn1.setOnClickListener {
            var aa = et1.text.toString()
            var bb = et2.text.toString()
            var cc = et3.text.toString()
            var dd = et4.text.toString()

            al.add(aa)
            al.add(bb)
            al.add(cc)
            al.add(dd)


            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("al",al)
            startActivity(intent)
        }
        Log.d("al","$al")
    }
}