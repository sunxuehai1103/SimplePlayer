package com.sxh.simpleplayer.activity

import android.widget.Toolbar
import com.sxh.simpleplayer.R
import com.sxh.simpleplayer.base.BaseActivity
import com.sxh.simpleplayer.util.FragmentUtil
import com.sxh.simpleplayer.util.IToolbarManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), IToolbarManager {

    override val mToolbar: Toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        super.initView()
        initMainToolBar()
    }

    override fun initListener() {
        super.initListener()
        bottomBar.setOnTabSelectListener {
            val transaction = supportFragmentManager.beginTransaction()
            FragmentUtil.fragmentUtil.getFragment(it)?.let { it1 ->
                transaction.replace(
                    R.id.container,
                    it1, it.toString()
                )
            }
            transaction.commit()
        }
    }
}