package com.enjoy.create.factory.fatoryMethod

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 工厂方法模式
 */
class FactoryTest {
    private var fruitFactory: FruitFactory = AppleFactory(); //需配置  方便软件体制的搭建

    fun peterDo() {
        val fruit = fruitFactory.getFruit()
        fruit.draw();
        println("peterDo------------")
    }

    fun jamesDo() {
        val fruit = fruitFactory.getFruit()
        fruit.draw();
        println("jamesDo------------")
    }

    fun lisonDo() {
        val fruit = fruitFactory.getFruit()
        fruit.draw();
        println("lisonDo------------")
    }
}

fun main(args: Array<String>) {
    FactoryTest().peterDo()
    FactoryTest().jamesDo()
    FactoryTest().lisonDo()
}
