package softmediaconsultores.com.prueba2

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import softmediaconsultores.com.prueba2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        inicio()
    }

    private fun inicio(){
        binding.btnMostrar.setOnClickListener {
            listar() }
    }
    private fun listar(){

        val listaColores = generarLista()

        val adapter = ColorAdapter(this, listaColores)
        binding.lista.adapter=adapter
    }

    private fun generarLista(): List<Color>{
        val circulo = R.drawable.item
        return listOf(
            Color("#e02020",circulo),
            Color("#703735",circulo),
            Color("#d47cb7",circulo),
            Color("#ba4343",circulo),
            Color("#6e3e3e",circulo),
            Color("#a66438",circulo),
            Color("#ff9a9a",circulo),
            Color("#aeaeae",circulo),
            Color("#870a3d",circulo),
            Color("#a96363",circulo),
            Color("#c01c67",circulo),
            Color("#eaa9a9",circulo),
            Color("#896161",circulo),
            Color("#cd9898",circulo)
        )
    }
}
