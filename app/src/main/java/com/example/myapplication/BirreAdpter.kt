package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import layout.RigaBirraViewHolder

class BirreAdpter(val dataset:ArrayList<Birra>):RecyclerView.Adapter<RigaBirraViewHolder> {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RigaBirraViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return RigaBirraViewHolder(layoutInflater.from(context).inflate()R.layout.riga_birra,viewGropup)
    }
     override fun getItemCount(): Int{
         return.dataset.size
     }
}