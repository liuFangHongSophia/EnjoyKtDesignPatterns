package com.enjoy.structure.decorator

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 装饰器模式
 */
open class BagDecorator(var bag: Bag) : Bag {//维持一个对抽象构建的对象的引用

    override fun pack(fruit: Fruit) {
        bag.pack(fruit) //重点
    }
}