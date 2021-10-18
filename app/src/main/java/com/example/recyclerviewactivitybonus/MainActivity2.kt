package com.example.recyclerviewactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var al : ArrayList<String>
    lateinit var rv:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rv = findViewById(R.id.rv)

         al = intent.getStringArrayListExtra("al") as ArrayList<String>

        Log.d("al","$al")
        rv.adapter = MyAdapter(al)
        rv.layoutManager = LinearLayoutManager(this)

    }
}