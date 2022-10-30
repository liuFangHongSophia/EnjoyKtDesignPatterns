package com.enjoy.create.factory.abstractFactory

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit
import com.enjoy.entity.bag.BananaBag
import com.enjoy.entity.fruit.Banana

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 抽象工厂模式
 */
class BananaFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Banana(45)
    }

    override fun getBag(): Bag {
       return BananaBag()
    }
}