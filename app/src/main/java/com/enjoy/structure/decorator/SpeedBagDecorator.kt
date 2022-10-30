package com.enjoy.structure.decorator

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 装饰器模式
 */
class SpeedBagDecorator(bag: Bag) : BagDecorator(bag) {

    override fun pack(fruit: Fruit) {
        super.pack(fruit)//调用原有的业务
        checked()
    }

    //增加防伪标识
    private fun checked() {
       println("___________")
        println("这是一个加急邮件，请快递大哥优先送一下")
    }
}