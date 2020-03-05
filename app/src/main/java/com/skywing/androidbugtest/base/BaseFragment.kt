package com.skywing.androidbugtest.base

import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider

open class BaseFragment : Fragment() {
    protected lateinit var mContext: Context
    private var mContainerView: View? = null
    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        if(Build.VERSION.SDK_INT < 23)
            this.mContext = activity

    }

    @TargetApi(23)
    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun addFragment(targetFragment:BaseFragment,containerViewId : Int){
        var transaction : FragmentTransaction = fragmentManager!!.beginTransaction()
        if(!targetFragment.isAdded)
            transaction.add(containerViewId,targetFragment,targetFragment.javaClass.name)
        else
            transaction.show(targetFragment)
        transaction.commit()
    }

    protected fun replaceFragment(targetFragment: BaseFragment,containerViewId: Int){
        var transaction: FragmentTransaction = fragmentManager!!.beginTransaction()

        transaction.replace(containerViewId,targetFragment,targetFragment.javaClass.name)

        transaction.commit()
    }

}