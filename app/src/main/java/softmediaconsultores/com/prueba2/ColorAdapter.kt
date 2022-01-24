package softmediaconsultores.com.prueba2

import android.content.Context
import android.graphics.BlendModeColorFilter
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.color.view.*

class ColorAdapter(private val mContext: Context, private val listacolor: List<Color>): ArrayAdapter<Color>(mContext,0,listacolor) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layout = LayoutInflater.from(mContext).inflate(R.layout.color,parent,false)
        val color = listacolor[position]
        val circulo = layout.findViewById<View>(R.id.incolor)
        val bordes = layout.findViewById<View>(R.id.incolor2)
        circulo?.background?.setTint(android.graphics.Color.parseColor(color.colorhex))
        return layout
    }
}

