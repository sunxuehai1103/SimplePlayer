package com.sxh.simpleplayer.util

import android.content.Intent
import android.widget.Toolbar
import com.sxh.simpleplayer.R
import com.sxh.simpleplayer.activity.SettingActivity

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   : toolbar管理
 */
interface IToolbarManager {

    val mToolbar:Toolbar

    /**
     * 初始化主界面中的toolbar
     */
    fun initMainToolBar() {
        mToolbar.setTitle("我的影音")
        mToolbar.inflateMenu(R.menu.main)
        mToolbar.setOnMenuItemClickListener {
            mToolbar.context.startActivity(Intent(mToolbar.context, SettingActivity::class.java))
            true
        }
    }


}