package com.example.hor_scopo_.utils

import android.R.attr.id
import android.content.Context

class SessionManager(context: Context) {

    val sharedPreferences = context.getSharedPreferences ("horoscope_session", Context.MODE_PRIVATE)


    fun setFavorite(ID: String){
        val editor = sharedPreferences.edit()
        editor.putString("FAVORITE_HOROSCOPE", id)
        editor.apply()
    }
    fun getFavorite() : String{
        return  sharedPreferences.getString("FAVORITE_HOROSCOPE", "")!!

    }
    fun isFavorite(id: String): Boolean {
        return id == getFavorite()}
}