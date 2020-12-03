package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var plus:Button
    lateinit var result:TextView
    lateinit var livedata:mainviewmodle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus=findViewById(R.id.btn_add)
        result=findViewById(R.id.txt_result)
        livedata=ViewModelProvider(this).get(mainviewmodle::class.java)
        livedata.scope.observe(this, Observer {
            result.text=it.toString()
        })
        plus.setOnClickListener {
            livedata.add(Integer.parseInt(result.text.toString()))
        }
    }

}