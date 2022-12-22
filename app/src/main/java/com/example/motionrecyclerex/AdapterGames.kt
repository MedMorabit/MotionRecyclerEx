package com.example.motionrecyclerex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class AdapterGames(private val list:List<Game>): RecyclerView.Adapter<AdapterGames.GamesHolder>() {


    class GamesHolder(var view:View):ViewHolder(view){
        var imageView= view.findViewById<ImageView>(R.id.idImageGame)!!
        var title= view.findViewById<TextView>(R.id.titleGame)!!
        var description= view.findViewById<TextView>(R.id.descriptionGame)!!
       fun bind(game: Game){
          title.text=game.title
           description.text=game.description
           Glide.with(view).load(game.image).into(imageView)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesHolder {
         val v=LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent,false)
        return GamesHolder(v)
    }

    override fun onBindViewHolder(holder: GamesHolder, position: Int) {
        val game=list[position]
           holder.bind(game)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}