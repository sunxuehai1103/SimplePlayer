package com.sxh.simpleplayer.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sxh.simpleplayer.R
import com.sxh.simpleplayer.base.BaseFragment

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   : Fragment基类
 */
class VBangFragment : BaseFragment() {

    override fun createView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        bundle: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_vbang,container,false)
    }


}