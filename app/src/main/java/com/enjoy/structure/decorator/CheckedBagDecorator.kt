package com.enjoy.structure.decorator

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 装饰器模式
 */
class CheckedBagDecorator(bag: Bag) : BagDecorator(bag) {

    override fun pack(fruit: Fruit) {
        super.pack(fruit)
        checked()
    }

    //增加防伪标识
    private fun checked() {
       println("___________")
        println("打印上防伪标识")
    }
}