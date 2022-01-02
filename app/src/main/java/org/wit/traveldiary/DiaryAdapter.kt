package org.wit.traveldiary

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DiaryAdapter(
    var diarys: List<Diary>
    ): RecyclerView.Adapter<DiaryAdapter.DiaryViewHolder>()

{
    inner class DiaryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiaryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_diary, parent, false)
        return DiaryViewHolder(view)
    }
    override fun getItemCount(): Int {
        return diarys.size
    }

    override fun onBindViewHolder(holder: DiaryViewHolder, position: Int) {
        holder.itemView.apply{
            tvTitle.text = diarys[position].title

        }
    }


}