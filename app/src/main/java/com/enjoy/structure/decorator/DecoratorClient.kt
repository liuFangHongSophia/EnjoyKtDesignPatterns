package com.enjoy.structure.decorator

import com.enjoy.create.factory.abstractFactory.AppleFactory
import com.enjoy.entity.Bag

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 装饰器模式 使用
 */
class DecoratorClient {

    fun senFruit() {
        var bag: Bag
        val factory = AppleFactory()
        //得到水果

        val fruit = factory.getFruit()
        fruit.draw()

        //需要增加防伪标识
        bag = CheckedBagDecorator(factory.getBag())
        bag = ReinforceBagDecorator(bag)//加固功能
        bag = SpeedBagDecorator(bag)//加速功能
        bag.pack(fruit)
    }
}

fun main() {
    DecoratorClient().senFruit()
}