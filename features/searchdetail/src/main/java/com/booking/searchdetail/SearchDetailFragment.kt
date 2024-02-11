package com.booking.searchdetail

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.booking.common.base.BaseFragment
import com.booking.common.base.BaseViewModel
import com.booking.searchdetail.databinding.FragmentSearchDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchDetailFragment: BaseFragment<FragmentSearchDetailBinding>(FragmentSearchDetailBinding::inflate) {
    val viewModel : SearchDetailViewModel by viewModels()
    val args : SearchDetailFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val itemId = it.getString("itemId")
        }

        binding.layoutUser.txtName
    }
    override fun mViewModel(): BaseViewModel {
        return viewModel
    }


}