package jp.techacademy.minami.jommo.kotlinlog3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str1 = "Hello"
        val str2 = "World"

        val str3 = "Hello"
        val length = str3.length
        Log.d("kotlintest", length.toString())

    }
}
