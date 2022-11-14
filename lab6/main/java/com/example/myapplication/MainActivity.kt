package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prefs = this.getSharedPreferences("com.example.myapplication", Context.MODE_PRIVATE)
        val buttonClick = findViewById<Button>(R.id.button_click)
        var text = findViewById<EditText>(R.id.etext)
        val editor = prefs.edit()
        val navHostFragment: Fragment? =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        var currFrag = 1
        text.setText(prefs.getString("TEXT",""))
        buttonClick.setOnClickListener {
            editor.putString("TEXT", text.text.toString()).apply()
        }
        val f1Click = findViewById<Button>(R.id.f1)
        val f2Click = findViewById<Button>(R.id.f2)

        f1Click.setOnClickListener {
            if(currFrag == 2) {
                var f2 = navHostFragment?.childFragmentManager?.fragments?.last()
                if (f2 != null) {
                    f2.view?.let { it2 ->
                        Navigation.findNavController(it2)
                            .navigate(R.id.action_secondFragment_to_firstFragment)
                    }
                    currFrag=1
                }
            }
        }
        f2Click.setOnClickListener {
            if(currFrag == 1) {
                var f1 = navHostFragment?.childFragmentManager?.fragments?.last()
                if (f1 != null) {
                    f1.view?.let { it1 ->
                        Navigation.findNavController(it1)
                            .navigate(R.id.action_firstFragment_to_secondFragment)
                    }
                    currFrag=2
                }
            }
        }
    }
}