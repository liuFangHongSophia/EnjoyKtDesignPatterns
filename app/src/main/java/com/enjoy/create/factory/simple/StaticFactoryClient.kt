package com.enjoy.create.factory.simple

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 静态工厂模式
 */
class StaticFactoryClient {

    fun peterDo() {
//            val fruit = StaticFactory.getFruitApple()
        val fruit = StaticFactory().getFruit(StaticFactory().TYPE_APPLE)
        fruit?.draw();
        println("peterDo------------")
    }

    fun jamesDo() {
        val fruit = StaticFactory().getFruitOrange()
        fruit.draw();
        println("jamesDo------------")
    }

    fun lisonDo() {
        val fruit = StaticFactory().getFruitBanana()
        fruit.draw();
        println("lisonDo------------")
    }

}

fun main(args: Array<String>) {
    StaticFactoryClient().peterDo()
    StaticFactoryClient().jamesDo()
    StaticFactoryClient().lisonDo()
}
