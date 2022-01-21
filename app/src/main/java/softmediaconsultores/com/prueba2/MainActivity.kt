package softmediaconsultores.com.prueba2

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listar()
    }
    private fun listar(){
        val circulo = R.drawable.item

        val color = Color("#ffffff", circulo)

        val listaColores = listOf(color)

        val adapter = ColorAdapter(this, listaColores)
        lista.adapter = adapter
    }
}
