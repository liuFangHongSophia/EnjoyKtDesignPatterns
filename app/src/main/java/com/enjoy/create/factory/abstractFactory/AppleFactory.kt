package com.enjoy.create.factory.abstractFactory

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit
import com.enjoy.entity.bag.AppleBag
import com.enjoy.entity.fruit.Apple

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 抽象工厂模式
 */
class AppleFactory : AbstractFactory() {
    override fun getFruit(): Fruit {
        return Apple(78);
    }

    override fun getBag(): Bag {
        return AppleBag()
    }
}