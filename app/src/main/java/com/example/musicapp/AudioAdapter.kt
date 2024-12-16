package com.example.musicapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AudioAdapter (audios : ArrayList<AudioModel>):
   RecyclerView.Adapter<AudioAdapter.AudioViewHolder>() {

   private var audio: ArrayList<AudioModel> = ArrayList<AudioModel>()

   init {
      audio = audios
   }

   class AudioViewHolder (itemView): RecyclerView.ViewHolder (itemView){

      var title : TextView = itemView.findViewById(R.id.video_play_back)
      var path : TextView = itemView.findViewById(R.id.file_path)
   }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AudioViewHolder {

      val view : View = LayoutInflater.from(parent.context)
         .inflate(R.layout.audio_view_layout,parent, false)
      return AudioViewHolder(view)
   }

   override fun getItemCount(): Int {
      return audio.size
   }

   override fun onBindViewHolder(holder: AudioViewHolder, position: Int) {

      val audiomodel : AudioModel = audio[position]
      holder.title.setText(audiomodel.title)
      holder.path.setText(audiomodel.path)
   }

}