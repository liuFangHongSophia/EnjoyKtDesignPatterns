package com.enjoy.create.singleton

import java.util.concurrent.atomic.AtomicInteger

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 饿汉式单例模式
 */
class SessionCount {
    private val count = AtomicInteger(0)

    //饿汉式
//     object SessionCount {}

/*    懒汉式
    companion object {
        val instance by lazy(LazyThreadSafetyMode.NONE) {//线程安全 类似同步锁
            SessionCount()
        }
    }*/

    //双重校验写法 性能达到极致
    companion object {
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            SessionCount()
        }
    }


    fun plus(): Int {
        return count.incrementAndGet()
    }

    fun decrease(): Int {
        return count.decrementAndGet()
    }

    fun showMessage() {
        println("当前人数：${this.count.get()}")
    }
}