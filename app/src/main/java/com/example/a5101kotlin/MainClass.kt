package com.example.a5101kotlin

class MainClass {

    var posts: Posts? = null
    var story: ArrayList<Story>? = ArrayList()

    constructor(posts: Posts?) {
        this.posts = posts
    }

    constructor(story: ArrayList<Story>?) {
        this.story = story
    }
}