package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 *  工厂方法模式
 */
interface FruitFactory {
    fun getFruit(): Fruit  //摘水果指令
}