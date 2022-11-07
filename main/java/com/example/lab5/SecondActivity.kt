package com.example.lab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var studentList = ArrayList<Student>()
        studentList.add(Student("Harry","Potter"))
        studentList.add(Student("John","Snow"))
        studentList.add(Student("Jan","Kowalski"))
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(studentList)
        recycler.adapter = adapter
    }
}