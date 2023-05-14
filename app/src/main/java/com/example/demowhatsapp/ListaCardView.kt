package com.example.demowhatsapp
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demowhatsapp.AdaptadorCardView
import com.example.demowhatsapp.Elementos
import com.example.demowhatsapp.R
import kotlinx.android.synthetic.main.activity_lista_card_view.*

class ListaCardView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_card_view)

        setSupportActionBar(findViewById(R.id.mitoolbar))
        //supportActionBar?.setHomeAsUpIndicator(android.R.drawable.ic_menu_preferences)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        lista.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        lista.layoutManager = LinearLayoutManager(this);

        var llenarLista = ArrayList<Elementos>()
        for (i in 1 until 9) {
            llenarLista.add(Elementos("Elemento "+i,
                BitmapFactory.decodeResource(resources, R.drawable.logo)))
        }

        val adapter = AdaptadorCardView(llenarLista)
        lista.adapter = adapter
    }
}
