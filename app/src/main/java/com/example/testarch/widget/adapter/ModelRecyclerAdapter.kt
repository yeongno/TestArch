package com.example.testarch.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.testarch.model.CellType
import com.example.testarch.model.Model
import com.example.testarch.screen.base.BaseViewModel
import com.example.testarch.util.mapper.ModelViewHolderMapper
import com.example.testarch.util.provider.ResourcesProvider
import com.example.testarch.widget.adapter.listener.AdapterListener
import com.example.testarch.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M: Model, VM:BaseViewModel> (
    private var modelList: List<Model>,
    private var viewModel: VM,
    private val resourcesProvider: ResourcesProvider,
    private val adapterListener: AdapterListener
): ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {
    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int = modelList[position].type.ordinal

    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder){
            bindData(modelList[position]as M)
            bindViews(modelList[position]as M,adapterListener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(parent, CellType.values()[viewType],viewModel,resourcesProvider)
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let{modelList = it}
        super.submitList(list)
    }
}