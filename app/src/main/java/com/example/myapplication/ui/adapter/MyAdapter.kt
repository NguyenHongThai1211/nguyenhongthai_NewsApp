package com.example.myapplication.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.ui.SecondActivity
import com.example.myapplication.data.News

class RecAadapter(private val newsList : ArrayList<News>) : RecyclerView.Adapter<RecAadapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgTitle: ImageView = itemView.findViewById(R.id.imgTitle)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val constraint_row : ConstraintLayout = itemView.findViewById(R.id.constraint_row)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newsList[position]

        holder.imgTitle.setImageResource(currentItem.imageTitle)
        holder.tvName.text = currentItem.name

        val cont = holder.constraint_row.context
        holder.constraint_row.setOnClickListener {
            val intent = Intent(it.context, SecondActivity::class.java)

            intent.putExtra("image",currentItem.imageTitle)
            intent.putExtra("title",currentItem.name)
            val putExtra = intent.putExtra("ingredients", currentItem.ingredients)

            it.context.startActivity(intent)

            Toast.makeText(cont, "the item ${currentItem.name} is clicked", Toast.LENGTH_SHORT).show()
        }


        holder.constraint_row.setOnLongClickListener(View.OnLongClickListener {
            Toast.makeText(cont, "the item ${currentItem.name} is long clicked", Toast.LENGTH_SHORT).show()

            return@OnLongClickListener true
        })


        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.cardView.context,
            R.anim.scale_up
        ))

    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}
