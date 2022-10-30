package com.enjoy.structure.facede

import com.enjoy.structure.bridge.bag.SmallBag
import com.enjoy.structure.bridge.material.Paper
import com.enjoy.structure.bridge.material.Plastic

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 外观模式 采摘服务
 */
class PickService {

    fun doPick() {
        //用包装盒
        val pickBag = SmallBag(Paper())

        //开始采摘
        pickBag.pick()
    }

    fun doOther() {
        println("其他服务...")
    }
}

