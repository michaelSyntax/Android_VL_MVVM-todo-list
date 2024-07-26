package com.example.android_vl_mvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.android_vl_mvvm.R
import com.example.android_vl_mvvm.databinding.FragmentTodoListBinding
import com.example.android_vl_mvvm.viewModel.SharedViewModel


class TodoListFragment : Fragment() {
    private lateinit var vb: FragmentTodoListBinding
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentTodoListBinding.inflate(inflater, container, false)
        return vb.root
    }
}