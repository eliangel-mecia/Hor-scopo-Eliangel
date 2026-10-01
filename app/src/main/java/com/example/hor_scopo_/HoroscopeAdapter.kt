package com.example.hor_scopo_

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.annotations.Debug

class HoroscopeAdapter(val items: List<Horoscope>) : RecyclerView.Adapter<HoroscopeViewHolder>() {

    //Cual es la vista de cada elemento
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(resourse=R.Layout.item horoscope), root =parent, attachToRoot=
        return HoroscopeViewHolder (view)
    }


//Cuales son los datos del elemento que esta en tal posicion
    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
       val horoscope = items[position]
       holder.render(horoscope)

    }


//Cuantos elementos tengo que mostrar
    override fun getItemCount(): Int {
        return items.size

    }

}

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val signImageView: ImageView = view.findViewById(R.id.signImagenView)
    val nameTextView: TextView =view.findViewById(R.id.TextView)
    val dateTextView: TextView =view.findViewById(R.id.TextView)

    fun render(horoscope:Horoscope) {

         signImageView: ImageView = setText
         nameTextView: TextView = set
         dateTextView: TextView = set
    }
}