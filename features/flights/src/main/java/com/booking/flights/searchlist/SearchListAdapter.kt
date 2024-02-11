package com.booking.flights.searchlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.booking.entities.uimodel.FlightListUIModel
import com.booking.flights.databinding.ListItemFlightBinding

class SearchListAdapter(val onClickItem : (FlightListUIModel)->Unit) : RecyclerView.Adapter<SearchListViewHolder>() {

    private val differ = AsyncListDiffer(this, diffCallback)

    fun setData(items : List<FlightListUIModel>) {
        differ.submitList(items)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemFlightBinding.inflate(inflater, parent, false)

        return SearchListViewHolder(binding, onClickItem)
    }

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
        differ.currentList.getOrNull(position)?.let {
            holder.bind(it)
        }
    }

    companion object {
        private val diffCallback = object :  DiffUtil.ItemCallback<FlightListUIModel>() {
            override fun areItemsTheSame(oldItem: FlightListUIModel, newItem: FlightListUIModel): Boolean {
                return oldItem.enuid == newItem.enuid
            }

            override fun areContentsTheSame(oldItem: FlightListUIModel, newItem: FlightListUIModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class SearchListViewHolder(private val binding : ListItemFlightBinding, val onClickItem : (FlightListUIModel)->Unit) : RecyclerView.ViewHolder(binding.root) {
    fun bind(viewModel :  FlightListUIModel) {
        binding.txt.text = viewModel.airlineName
        binding.root.setOnClickListener {
            onClickItem(viewModel)
        }
    }
}