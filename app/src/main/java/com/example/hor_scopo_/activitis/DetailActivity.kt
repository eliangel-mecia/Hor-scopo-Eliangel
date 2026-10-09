package com.example.hor_scopo_.activitis

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hor_scopo_.data.Horoscope
import com.example.hor_scopo_.R
import com.example.hor_scopo_.utils.SessionManager

class DetailActivity : AppCompatActivity() {

    lateinit var session: SessionManager

    lateinit var horoscope: Horoscope

    lateinit var favorite:

    var isFavorite = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        session = SessionManager(this)


        val id = intent.getStringExtra("HOROSCOPE_ID")!!

        val horoscope = Horoscope.getById(id)

        supportActionBar?.setTitle(horoscope.name)
        supportActionBar?.setSubtitle(horoscope.dates)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_search)

        isFavorite = session.isFavorite(id)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_detail_menu, menu)

        val x = menu_findItem(R.menu.activity_detail_menu)

        setFavoriteIcon()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            android.R.id.home -> {
                //me haces una cosa
                //el horoscopo es favorito o no?? para guardarlo o quitarlo
                true
            }

            R.id.menu_favorite -> {
                //me haces una cosa
                if (isFavorite) {
                    session.setFavorite("")
                } else {
                    session.setFavorite(horoscope.id)
                }
                isFovorite = isFavorite
                setFavoriteIcon()
                true
            }

            R.id.menu_share -> {
                //me haces una cosa
               val sendIntent = Intent (
                   sendTntent.action = Intent.ACTION_SEND
                   sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my to send.")
                   sendIntent.type ="text/plain"

                   val shareIntent= Intent.createChooser(sendIntent)
                   startActivity(shareIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)

        }
    }

    fun setFavoriteIcon(){
        if (isfavorite){
            // asigna corazon relleno
        }else{
            //asigna corazon vacio
        }


    }
}