package com.enjoy.create.factory.abstractFactory

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 抽象工厂模式  将一系列的产品工厂合并成一个
 */
class OrderSendClient {
    fun sendFruit() {
        //初始化工厂
        val factory = AppleFactory()//简单配置就可以
        //得到水果
        val fruit = factory.getFruit();
        fruit.draw()
        //得到包装
        val bag = factory.getBag()
        bag.pack(fruit)

        ///以下物流运输业务....
    }
}

fun main() {
    OrderSendClient().sendFruit()
}