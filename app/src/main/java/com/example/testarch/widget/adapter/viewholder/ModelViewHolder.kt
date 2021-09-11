package com.example.testarch.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.testarch.model.Model
import com.example.testarch.screen.base.BaseViewModel
import com.example.testarch.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: com.example.testarch.util.provider.ResourcesProvider
): RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model:M){
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}