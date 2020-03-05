package com.skywing.androidbugtest.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.skywing.androidbugtest.R
import com.skywing.androidbugtest.base.BaseActivity
import com.skywing.androidbugtest.databinding.ActivityMainBinding
import com.skywing.androidbugtest.ui.fragment.DataBindSameNameFLOneFragment
import com.skywing.androidbugtest.ui.fragment.DataBindSameNameFLTwoFragment

class MainActivity : BaseActivity(){
    private lateinit var binding:ActivityMainBinding
    private var currentFragment:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initView()

    }

    fun initView(){
        replaceFragment(DataBindSameNameFLOneFragment(),binding.flMain.id)
        binding.btnChangeFragment.setOnClickListener{ l ->
            if(currentFragment == 1){
                replaceFragment(DataBindSameNameFLTwoFragment(),binding.flMain.id)
                currentFragment = 2
            }else{
                replaceFragment(DataBindSameNameFLOneFragment(),binding.flMain.id)
                currentFragment = 1
            }
        }
    }
}