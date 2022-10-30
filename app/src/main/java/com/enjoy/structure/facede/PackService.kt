package com.enjoy.structure.facede

import com.enjoy.create.factory.abstractFactory.AppleFactory
import com.enjoy.structure.bridge.bag.SmallBag
import com.enjoy.structure.bridge.material.Paper
import com.enjoy.structure.bridge.material.Plastic
import com.enjoy.structure.decorator.CheckedBagDecorator
import com.enjoy.structure.decorator.ReinforceBagDecorator
import com.enjoy.structure.decorator.SpeedBagDecorator

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 外观模式 包装服务
 */
class PackService {

    fun doPack() {
        //水果打包：防伪，加急，加固
        val factory = AppleFactory()

        //得到包装
        var bag = factory.getBag()
        bag = CheckedBagDecorator(bag)
        bag = ReinforceBagDecorator(bag)
        bag = SpeedBagDecorator(bag)

        bag.pack(factory.getFruit())
    }

    fun doOther() {
        println("其他服务...")
    }
}

