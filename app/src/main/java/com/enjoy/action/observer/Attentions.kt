package com.enjoy.action.observer

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 观察者模式
 */
abstract class Attentions {

    //关注客户列表
    val observers = ArrayList<Observer>()

    //关注顾客
    fun add(observer: Observer) {
        observers.add(observer)
    }

    //取消关注
    fun remove(observer: Observer) {
        observers.remove(observer)
    }

    //发通知
    abstract fun notifyObservers()
}