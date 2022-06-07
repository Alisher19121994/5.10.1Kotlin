package com.example.a5101kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var list: ArrayList<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_view, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story = list[position]
        if (holder is StoryViewHolder) {
            holder.profile.setImageResource(story.profile)
            holder.fullname.text = story.fullname
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profile: ShapeableImageView = itemView.findViewById(R.id.story_view_profile_id)
        var fullname: TextView = itemView.findViewById(R.id.story_view_fullname_id)
    }
}