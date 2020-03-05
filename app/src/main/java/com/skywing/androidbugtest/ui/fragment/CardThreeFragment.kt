package com.skywing.androidbugtest.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.skywing.androidbugtest.R
import com.skywing.androidbugtest.base.BaseFragment
import com.skywing.androidbugtest.databinding.FragmentCardThreeBinding
import com.skywing.androidbugtest.databinding.FragmentCardTwoBinding

class CardThreeFragment :BaseFragment(){
    private lateinit var binding: FragmentCardThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_card_three,container,false)
        return binding.root
    }
}