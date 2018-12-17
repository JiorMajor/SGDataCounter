package com.chanpyaeung.sgdatacounter

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class YearlyUsageAdapter: PagedListAdapter<YearlyRecord, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<YearlyRecord>(){

    override fun areItemsTheSame(oldItem: YearlyRecord, newItem: YearlyRecord): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun areContentsTheSame(oldItem: YearlyRecord, newItem: YearlyRecord): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
})
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}