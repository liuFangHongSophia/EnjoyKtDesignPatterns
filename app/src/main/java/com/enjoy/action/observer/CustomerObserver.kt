package com.enjoy.action.observer

/**
 *
 * @author Sophia
 * @time 2022/10/28
 */
class CustomerObserver(val name: String) : Observer {
    override fun update() {
        println("$name 购买青芒")
    }
}