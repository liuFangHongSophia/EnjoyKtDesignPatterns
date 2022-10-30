package com.enjoy.structure.facede

import com.enjoy.create.factory.abstractFactory.AppleFactory
import com.enjoy.structure.bridge.bag.SmallBag
import com.enjoy.structure.bridge.material.Paper
import com.enjoy.structure.bridge.material.Plastic
import com.enjoy.structure.composite.DistrictNode
import com.enjoy.structure.composite.LeafNode
import com.enjoy.structure.decorator.CheckedBagDecorator
import com.enjoy.structure.decorator.ReinforceBagDecorator
import com.enjoy.structure.decorator.SpeedBagDecorator

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 外观模式 发送快递服务
 */
class SendService {

    fun doSend() {
        var root = DistrictNode("根")
        //一线及目录
        root.addChild(DistrictNode("上海"))
        root.addChild(DistrictNode("天津"))
        val districtNode = DistrictNode("北京")
        root.addChild(districtNode)
        //二级目录
        districtNode.addChild(DistrictNode("海定区"))
        districtNode.addChild(DistrictNode("西城区"))
        val districtNode2 = DistrictNode("朝阳区")
        districtNode.addChild(districtNode2)

        //三级目录
        districtNode2.addChild(LeafNode("三里屯"))
        districtNode2.addChild(LeafNode("朝阳外街"))
        println("请选定目的地：北京-朝阳区-三里屯")
        //以下物流运输业务...
        println("本次快递目的地目的地：北京-朝阳区-三里屯")

    }

    fun doOther() {
        println("其他服务...")
    }
}

