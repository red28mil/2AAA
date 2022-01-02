package org.wit.traveldiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var diaryList =mutableListOf(
            Diary("cool", false)
        )
        val adapter = DiaryAdapter(diaryList)
        dEntry.adapter = adapter
        dEntry.layoutManager = LinearLayoutManager(this)

        btnAddDiary.setOnClickListener{
            val title = .text.toString()
            val diary =Diary(title, false)
            diaryList.add(diary)
            adapter.notifyItemInserted(diaryList.size - 1)
        }
    }


}