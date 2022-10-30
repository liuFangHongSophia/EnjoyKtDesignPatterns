package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Apple

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 工厂方法模式
 */
class AppleFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Apple(23);
    }
}