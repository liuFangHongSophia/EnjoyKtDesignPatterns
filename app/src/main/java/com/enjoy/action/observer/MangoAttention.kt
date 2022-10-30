package com.enjoy.action.observer

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 观察者模式
 */
class MangoAttention : Attentions() {

    override fun notifyObservers() {
        for (obs in observers) {
            obs.update()
        }
    }

    //芒果到货了
    fun perform() {
        this.notifyObservers()
    }
}