package com.example.a5101kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FeedsAdapter(var context: Context, var list: ArrayList<MainClass>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var TYPE_ITEM_STORY = 0
    private var TYPE_ITEM_POST = 1

    override fun getItemViewType(position: Int): Int {
        return if (list[position].story!!.size > 0) TYPE_ITEM_STORY else TYPE_ITEM_POST
    }

    private fun storyAdapter(story: ArrayList<Story>, recyclerView: RecyclerView) {
        val adapter = StoryAdapter(context, story)
        recyclerView.adapter = adapter
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_ITEM_STORY) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.story, parent, false)
            return StoryViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post, parent, false)
        return PostsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val mainClass = list[position]

        if (holder is StoryViewHolder) {
            val recyclerView = holder.recyclerView
            mainClass.story?.let { storyAdapter(it, recyclerView) }
        }

        if (holder is PostsViewHolder) {
            holder.profile.setImageResource(mainClass.posts!!.profile)
            holder.photo.setImageResource(mainClass.posts!!.photo)
            holder.fullname.text = mainClass.posts!!.fullname
            holder.liked_comments.text = mainClass.posts!!.liked_comments
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView

        init {
            recyclerView = itemView.findViewById(R.id.storys_recyclerView)
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    inner class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile: ShapeableImageView = itemView.findViewById(R.id.post_profile_id)
        val fullname: TextView = itemView.findViewById(R.id.post_fullname_id)
        val liked_comments: TextView = itemView.findViewById(R.id.liked_comments_id)
        val photo: ImageView = itemView.findViewById(R.id.post_fullImage_id)

    }
}