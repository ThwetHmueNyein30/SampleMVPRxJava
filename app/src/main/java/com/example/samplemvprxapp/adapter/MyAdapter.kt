package com.example.samplemvprxapp.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.samplemvprxapp.R
import com.example.samplemvprxapp.data.vo.RetroCrypto
import com.example.samplemvprxapp.delegate.OnItemClickDelegate
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter (private val cryptoList : ArrayList<RetroCrypto>,
                 private val delegate: OnItemClickDelegate) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val colors : Array<String> = arrayOf("#7E57C2", "#42A5F5", "#26C6DA", "#66BB6A", "#FFEE58", "#FF7043" , "#EC407A" , "#d32f2f")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptoList[position],delegate,  colors, position)
    }

    override fun getItemCount(): Int = cryptoList.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bind(
            retroCrypto: RetroCrypto,
            delegate: OnItemClickDelegate,
            colors: Array<String>,
            position: Int
        ) {
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]))
            itemView.text_name.text = retroCrypto.currency
            itemView.text_price.text = retroCrypto.price
            itemView.layout.setOnClickListener {
                delegate.onItemClick(itemView.context,retroCrypto)
            }
        }
    }
}