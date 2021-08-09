package com.example.newrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(var todos: List<Todo>

) : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var todoTitle: TextView
        var todoCheck: CheckBox

        init {
            todoTitle = itemView.findViewById(R.id.tv_title)
            todoCheck = itemView.findViewById(R.id.cb_done)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.todoTitle.text = todos[position].title
        holder.todoCheck.isChecked = todos[position].isChecked


        }

    }

