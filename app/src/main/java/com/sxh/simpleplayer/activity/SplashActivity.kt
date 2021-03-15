package com.sxh.simpleplayer.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.sxh.simpleplayer.R
import com.sxh.simpleplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   : 闪屏页
 */
class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun initView() {
        super.initView()
        ViewCompat.animate(iv_splash).scaleX(1.0f).scaleY(1.0f)
            .setListener(this).duration = 2000
    }

    override fun onAnimationEnd(view: View?) {
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }
}