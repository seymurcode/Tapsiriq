package com.booking.hotels

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.booking.entities.uimodel.HotelListUIModel
import com.booking.hotels.databinding.ListItemHotelsBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class HotelListAdapter (val context: Context, val onClickItem : (HotelListUIModel)->Unit) : RecyclerView.Adapter<HotelListViewHolder>() {

    private val differ = AsyncListDiffer(this, diffCallback)

    fun setData(items : List<HotelListUIModel>) {
        differ.submitList(items)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemHotelsBinding.inflate(inflater, parent, false)

        return HotelListViewHolder(binding, onClickItem, context)
    }

    override fun onBindViewHolder(holder: HotelListViewHolder, position: Int) {
        differ.currentList.getOrNull(position)?.let {
            holder.bind(it)
        }
    }

    companion object {
        private val diffCallback = object :  DiffUtil.ItemCallback<HotelListUIModel>() {
            override fun areItemsTheSame(oldItem: HotelListUIModel, newItem: HotelListUIModel): Boolean {
                return oldItem.enuid == newItem.enuid
            }

            override fun areContentsTheSame(oldItem: HotelListUIModel, newItem: HotelListUIModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class HotelListViewHolder(private val binding : ListItemHotelsBinding, val onClickItem : (HotelListUIModel)->Unit, val context: Context)  : RecyclerView.ViewHolder(binding.root) {
    fun bind(viewModel :  HotelListUIModel) {
        binding.name.text = viewModel.name
        binding.rating.text = viewModel.rating
        binding.ratingType.text = viewModel.rating_type
        binding.price.text = viewModel.price
        binding.roomType.text = viewModel.room_type
        binding.address.text = viewModel.address
        binding.includeType.text = viewModel.include_type
        binding.centerDistance.text = viewModel.center_distance
        binding.dayCount.text = viewModel.day_count
        /*binding.root.setOnClickListener {
            onClickItem(viewModel)
        }*/
        Glide
            .with(context)
            .load(viewModel.image_link)
            .centerCrop()
            //.placeholder(R.drawable.loading_spinner)
            .into(binding.imageView);
    }
}