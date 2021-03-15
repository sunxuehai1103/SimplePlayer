package com.sxh.simpleplayer.extension

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * @author : sxh
 * e-mail : 820793721@qq.com
 * @date   : 2021/3/15
 * desc   : 扩展函数定义
 */
fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

fun Context.toast(msgId: Int) = Toast.makeText(this, getString(msgId), Toast.LENGTH_SHORT).show()

fun log(msg: String) = Log.d("sxh", msg)