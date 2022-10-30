package com.enjoy.action.observer

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 观察者模式 使用
 */
class ObserverClient {
}

fun main() {
    val attentions = MangoAttention()
    attentions.add(CustomerObserver("deer"))
    attentions.add(CustomerObserver("james"))
    attentions.add(CustomerObserver("lison"))
    attentions.add(CustomerObserver("mark"))

    attentions.perform()
}