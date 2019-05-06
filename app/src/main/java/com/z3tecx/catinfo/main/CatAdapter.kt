package com.z3tecx.catinfo.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.z3tecx.catinfo.R
import com.z3tecx.catinfo.api.ApiCat
import kotlinx.android.synthetic.main.item_list.view.*


class CatAdapter(val breedList: List<ApiCat>, val context: Context) :
    RecyclerView.Adapter<CatAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, p0, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.textCatName.text = breedList.get(position).name
        holder.itemView.textCatOrigin.text = breedList.get(position).origin
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
