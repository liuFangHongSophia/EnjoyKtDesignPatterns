package com.enjoy.action.observer.jdk

import java.util.Observable

/**
 *
 * @author Sophia
 * @time 2022/10/29
 */
class Mango(name: String) : Observable() {

    //芒果到货了
    fun perform() {
        this.setChanged()
        this.notifyObservers()
    }
}