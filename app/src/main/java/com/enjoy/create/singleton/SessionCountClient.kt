package com.enjoy.create.singleton

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
class SessionCountClient {


}

fun main() {
//    val count=SessionCount()//饿汉式
    val count = SessionCount.instance //懒汉式、双重校验单例

    count.plus()
    count.showMessage()

    count.plus()
    count.showMessage()

    //出去一个
    count.decrease()
    count.showMessage()
}