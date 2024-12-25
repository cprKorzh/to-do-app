package com.cpr_korzh.todos.fragments

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    abstract fun onClickNew()
}