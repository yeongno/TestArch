package com.example.testarch.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.testarch.databinding.ViewholderEmptyBinding
import com.example.testarch.model.CellType
import com.example.testarch.model.Model
import com.example.testarch.screen.base.BaseViewModel
import com.example.testarch.widget.adapter.viewholder.EmptyViewHolder
import com.example.testarch.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model>map(
        parent:ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: com.example.testarch.util.provider.ResourcesProvider
        ):ModelViewHolder<M>{
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when(type){
            CellType.EMPTY_CELL->EmptyViewHolder(
                ViewholderEmptyBinding.inflate((inflater),parent,false),
                viewModel,
                resourcesProvider
            )
        }
        return viewHolder as ModelViewHolder<M>
    }

}