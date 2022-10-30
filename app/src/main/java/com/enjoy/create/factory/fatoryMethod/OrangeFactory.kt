package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 工厂方法模式
 */
class OrangeFactory : FruitFactory {
    override fun getFruit(): Fruit {
        return Orange("Peter", 80)
    }
}