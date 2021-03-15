package com.sxh.simpleplayer.util

import androidx.fragment.app.Fragment
import com.sxh.simpleplayer.R
import com.sxh.simpleplayer.fragment.HomeFragment
import com.sxh.simpleplayer.fragment.MvFragment
import com.sxh.simpleplayer.fragment.VBangFragment
import com.sxh.simpleplayer.fragment.YueDanFragment

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   :
 */
class FragmentUtil private constructor() {

    companion object {
        val fragmentUtil by lazy {
            FragmentUtil()
        }
    }

    private val homeFragment by lazy { HomeFragment() }
    private val mvFragment by lazy { MvFragment() }
    private val vbangFragment by lazy { VBangFragment() }
    private val yuedanFragment by lazy { YueDanFragment() }


    fun getFragment(tabId: Int): Fragment? {
        when (tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vbangFragment
            R.id.tab_yuedan -> return yuedanFragment
        }
        return null
    }

}