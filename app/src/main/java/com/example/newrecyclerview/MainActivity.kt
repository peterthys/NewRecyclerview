package com.example.newrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todos = mutableListOf(
            Todo("voetbal", false),
            Todo("lopen", true),
            Todo("eten", false)

        )
        val adapter = TodoAdapter(todos)
        var but: Button = findViewById(R.id.btAddTodo)
        var rv: RecyclerView = findViewById(R.id.rvTodos)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        val editTextTodo: EditText = findViewById(R.id.etTodo)
        but.setOnClickListener {

            val title = editTextTodo.text.toString()
            val todo = Todo(title, false)
            todos.add(todo)
            adapter.notifyItemInserted(todos.size-1)
            editTextTodo.setText("")

        }

    }
}