package com.sxh.simpleplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.startActivity

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   : Activity基类
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        initView()
        initData()
        initListener()
    }

    /**
     * 初始化布局
     */
    open fun initView() {}

    /**
     * 初始化数据
     */
    open fun initData() {}

    /**
     * 初始化监听器
     */
    open fun initListener() {}

    /**
     * 获取布局Id
     */
    abstract fun getLayoutId(): Int

    /**
     * 开启activity并且finish当前界面
     */
    inline fun <reified T:BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}