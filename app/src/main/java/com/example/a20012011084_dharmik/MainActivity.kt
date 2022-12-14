package com.example.a20012011084_dharmik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showmessage(msg:String){
        Log.i(tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showmessage("Congratulations ! You Achieved ")
    }

    override fun onResume() {
        super.onResume()
        showmessage("Great")
    }
}