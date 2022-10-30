package com.enjoy.action.observer.jdk

/**
 *
 * @author Sophia
 * @time 2022/10/29
 * 尽量使用jdk提供的观察者类
 */
class JdkObserverClient {
}

fun main() {
    val attentions = Mango("芒果")
    attentions.addObserver(Customer("derr"))
    attentions.addObserver(Customer("james"))
    attentions.addObserver(Customer("lison"))
    attentions.addObserver(Customer("mark"))
    attentions.perform()
}