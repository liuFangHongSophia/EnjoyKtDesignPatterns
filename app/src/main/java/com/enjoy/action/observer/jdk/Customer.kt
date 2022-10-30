package com.enjoy.action.observer.jdk


import java.util.Observable
import java.util.Observer

/**
 *
 * @author Sophia
 * @time 2022/10/29
 * 观察者模式  JDK对观察者模式的支持
 */
class Customer(val name: String) : Observer {

    override fun update(o: Observable?, arg: Any?) {
        println("$name 购买青芒")
    }
}