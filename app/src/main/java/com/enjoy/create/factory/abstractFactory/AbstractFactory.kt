package com.enjoy.create.factory.abstractFactory

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 抽象水果工厂模式
 */
abstract class AbstractFactory {
    abstract fun getFruit(): Fruit
    abstract fun getBag(): Bag
}