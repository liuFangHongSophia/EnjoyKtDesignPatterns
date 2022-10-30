package com.enjoy.create.factory.simple

import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Apple
import com.enjoy.entity.fruit.Banana
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 简单工厂模式----静态工厂模式
 */
class StaticFactory {

    val TYPE_APPLE: Int = 1
    val TYPE_ORANGE: Int = 2
    val TYPE_BANANA: Int = 3

    fun getFruit(type: Int): Fruit? {
        when (type) {
            TYPE_APPLE -> Apple(0)
            TYPE_ORANGE -> Orange("Peter", 80)
            TYPE_BANANA -> Banana(0)
        }
        return null
    }


    /**用多个方法来拆分*/
    fun getFruitApple(): Fruit {
        return Apple(0)
    }

    fun getFruitOrange(): Fruit {
        return Orange("Peter", 80)
    }

    fun getFruitBanana(): Fruit {
        return Banana(20)
    }
}