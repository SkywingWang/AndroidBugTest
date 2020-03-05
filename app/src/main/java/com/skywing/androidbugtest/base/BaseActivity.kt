package com.skywing.androidbugtest.base

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction

open class BaseActivity :FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    protected fun addFragment(targetFragment:BaseFragment,containerViewId : Int){
        var transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        if(!targetFragment.isAdded)
            transaction.add(containerViewId,targetFragment,targetFragment.javaClass.name)
        else
            transaction.show(targetFragment)
        transaction.commit()
    }

    protected fun replaceFragment(targetFragment: BaseFragment,containerViewId: Int){
        var transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        if(!targetFragment.isAdded)
            transaction.replace(containerViewId,targetFragment,targetFragment.javaClass.name)
        else
            transaction.show(targetFragment)
        transaction.commit()
    }
}