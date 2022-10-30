package com.enjoy.create.factory.abstractFactory

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit
import com.enjoy.entity.bag.OrangeBag
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 抽象工厂模式
 */
class OrangeFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Orange("Peter", 80)
    }

    override fun getBag(): Bag {
        return OrangeBag()
    }
}