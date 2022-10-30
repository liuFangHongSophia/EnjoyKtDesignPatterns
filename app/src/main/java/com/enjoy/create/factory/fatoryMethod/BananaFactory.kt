package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Banana

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 工厂方法模式
 */
class BananaFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Banana(45)
    }
}