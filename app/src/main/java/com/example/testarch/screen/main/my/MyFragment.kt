package com.example.testarch.screen.main.my

import com.example.testarch.databinding.FragmentMyBinding
import com.example.testarch.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class MyFragment: BaseFragment<MyViewModel, FragmentMyBinding> () {

    override val viewModel by viewModel<MyViewModel>()

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object{

        fun newInstance() = MyFragment()

        const val TAG = "MyFragment"

    }

}