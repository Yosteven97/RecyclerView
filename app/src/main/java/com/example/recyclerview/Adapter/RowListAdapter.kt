package com.example.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Activity.Model.Buku
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.adapter_row_list.view.*

class RowListAdapter : RecyclerView.Adapter<RowListAdapter.ViewHolder>() {

    private var dataList: ArrayList<Buku>? = ArrayList()

    fun addDataList(dataList: ArrayList<Buku>) {
        if (this.dataList == null) {
            this.dataList = ArrayList()
        }
        this.dataList?.addAll(dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_row_list, parent, false
        )
    )

    override fun getItemCount() = if (dataList == null) 0 else dataList?.size ?: 0

    private fun getItem(position: Int) = dataList?.get(position)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(getItem(position))

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(dataList: Buku?) = with(itemView) {

            /**
             * Set Data To View in XML
             */

            txtAuthor.text = dataList?.author
            txtTitle.text = dataList?.title
            txtIsbn.text = dataList?.isbn.toString()
        }

    }
}