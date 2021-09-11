package com.example.testarch.widget.adapter.viewholder

import com.example.testarch.databinding.ViewholderEmptyBinding
import com.example.testarch.model.Model
import com.example.testarch.screen.base.BaseViewModel
import com.example.testarch.util.provider.ResourcesProvider
import com.example.testarch.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel:BaseViewModel,
    resourcesProvider: ResourcesProvider
) :ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}