package com.example.a5101kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        adapter(data())
    }

    private fun data(): ArrayList<MainClass> {

        val mainClass = ArrayList<MainClass>()
        val story = ArrayList<Story>()

        story.add(Story(R.drawable.ali, "Alisher"))
        story.add(Story(R.drawable.rasms, "Alisher"))
        story.add(Story(R.drawable.r1, "Alisher"))
        story.add(Story(R.drawable.rasms, "Alisher"))
        story.add(Story(R.drawable.r2, "Alisher"))
        story.add(Story(R.drawable.rasms, "Alisher"))
        story.add(Story(R.drawable.r3, "Alisher"))
        story.add(Story(R.drawable.ali, "Alisher"))
        story.add(Story(R.drawable.r1, "Alisher"))
        story.add(Story(R.drawable.rasms, "Alisher"))
        story.add(Story(R.drawable.r3, "Alisher"))

        mainClass.add(MainClass(story))

        mainClass.add(MainClass(Posts(R.drawable.ali,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek Jumaev and 4585 others")))
        mainClass.add(MainClass(Posts(R.drawable.r1,"Alisher Daminov",R.drawable.r2,"Liked by Odilbek,Ravshan Jumaev and 478 others")))
        mainClass.add(MainClass(Posts(R.drawable.r2,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek,Ravshan and 877 others")))
        mainClass.add(MainClass(Posts(R.drawable.r3,"Alisher Daminov",R.drawable.r1,"Liked by Odilbek Jumaev and 4996 others")))
        mainClass.add(MainClass(Posts(R.drawable.ali,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek Jumaev and 4585 others")))
        mainClass.add(MainClass(Posts(R.drawable.r1,"Alisher Daminov",R.drawable.r2,"Liked by Odilbek,Ravshan Jumaev and 478 others")))
        mainClass.add(MainClass(Posts(R.drawable.r2,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek,Ravshan and 877 others")))
        mainClass.add(MainClass(Posts(R.drawable.r3,"Alisher Daminov",R.drawable.r1,"Liked by Odilbek Jumaev and 4996 others")))
        mainClass.add(MainClass(Posts(R.drawable.ali,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek Jumaev and 4585 others")))
        mainClass.add(MainClass(Posts(R.drawable.r1,"Alisher Daminov",R.drawable.r2,"Liked by Odilbek,Ravshan Jumaev and 478 others")))
        mainClass.add(MainClass(Posts(R.drawable.r2,"Alisher Daminov",R.drawable.r3,"Liked by Odilbek,Ravshan and 877 others")))
        mainClass.add(MainClass(Posts(R.drawable.r3,"Alisher Daminov",R.drawable.r1,"Liked by Odilbek Jumaev and 4996 others")))

        return mainClass
    }

    private fun adapter(mainClass: ArrayList<MainClass>) {
        val adapter = FeedsAdapter(this, mainClass)
        recyclerView.adapter = adapter
    }
}