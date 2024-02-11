package com.booking.hotels

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.booking.common.base.BaseFragment
import com.booking.common.toDetail
import com.booking.hotels.databinding.FragmentHotelListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HotelListFragment: BaseFragment<FragmentHotelListBinding>(FragmentHotelListBinding::inflate) {
    //ViewBinding
    val viewModel : HotelListViewModel by viewModels()
    private lateinit var adapter : HotelListAdapter
    override fun mViewModel(): HotelListViewModel {
        return viewModel
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecylerAdapter()

        lifecycleScope.launch {
            viewModel.getHotels()
        }

        viewModel.data.observe(viewLifecycleOwner) {
            adapter.setData(it?.hotels ?: listOf())
        }

    }

    private fun initRecylerAdapter() {
        adapter = HotelListAdapter (requireContext()){
                findNavController().toDetail(it.enuid)
            }

        binding.recylerView.layoutManager = LinearLayoutManager(context)
        binding.recylerView.adapter = adapter
    }

}