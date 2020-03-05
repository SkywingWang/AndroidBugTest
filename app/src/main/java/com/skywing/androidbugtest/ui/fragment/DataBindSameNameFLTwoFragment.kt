package com.skywing.androidbugtest.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.skywing.androidbugtest.R
import com.skywing.androidbugtest.base.BaseFragment
import com.skywing.androidbugtest.databinding.FragmentDatabindSameNameFlTwoBinding

class DataBindSameNameFLTwoFragment :BaseFragment() {

    private lateinit var binding: FragmentDatabindSameNameFlTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_databind_same_name_fl_two,container,false)
        initView()
        return binding.root
    }

    fun initView(){
        Log.i("DebugTest","DataBindSameNameFLTwoFragment FrameLayoutId : ${binding.flHorCardOne.id} | ${binding.flHorCardTwo.id} | ${binding.flHorCardThree.id}")
        addFragment(CardOneFragment(),binding.flHorCardOne.id)
        addFragment(CardTwoFragment(),binding.flHorCardTwo.id)
        addFragment(CardThreeFragment(),binding.flHorCardThree.id)
    }
}