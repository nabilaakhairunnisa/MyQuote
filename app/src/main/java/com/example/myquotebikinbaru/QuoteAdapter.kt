package com.example.myquotebikinbaru

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


//menghubungkan data dengan tampilan
class QuoteAdapter(private val listReview: ArrayList<String>) : RecyclerView.Adapter<QuoteAdapter.ViewHolder>() {

    //menginflate layout item_quote dan menyimpannya ke dalam viewholder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_quote, viewGroup, false)
        return ViewHolder(view)
    }

    //mengambil data berdasarkan array listReview dan menyimpannya ke dalam variabel tvItem
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvItem.text = listReview[position]
    }

    //mendapatkan panjang listReview
    override fun getItemCount(): Int {
        return listReview.size
    }

    //menampilkan data
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }
}
