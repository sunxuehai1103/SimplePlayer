package com.sxh.simpleplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   :
 */
abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return createView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initListener()
    }

    /**
     * 初始化
     */
    protected fun init() {}

    /**
     * 创建布局
     */
    abstract fun createView(inflater: LayoutInflater, container: ViewGroup?, bundle: Bundle?): View

    /**
     * 初始化数据
     */
    protected fun initData() {}

    /**
     * 初始化监听器
     */
    protected fun initListener() {}
}