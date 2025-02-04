package com.example.android_vl_mvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_vl_mvvm.R
import com.example.android_vl_mvvm.databinding.FragmentTodoListBinding


class TodoDetailFragment : Fragment() {

    private lateinit var vb: FragmentTodoListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentTodoListBinding.inflate(inflater, container, false)
        return vb.root
    }
}