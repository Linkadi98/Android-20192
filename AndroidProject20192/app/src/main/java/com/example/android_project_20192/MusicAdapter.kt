package com.example.android_project_20192

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_project_20192.model.Music

class MusicAdapter :RecyclerView.Adapter<MusicAdapter.MusicViewHolder>()
{
    private var data:List<Music> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        //TODO create viewhold
        return MusicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.song_item,parent,false))
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
    }

    inner class MusicViewHolder(v:View):RecyclerView.ViewHolder(v){

    }
}