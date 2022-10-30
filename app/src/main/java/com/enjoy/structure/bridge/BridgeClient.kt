package com.enjoy.structure.bridge

import com.enjoy.structure.bridge.bag.BigBag
import com.enjoy.structure.bridge.bag.SmallBag
import com.enjoy.structure.bridge.material.Paper
import com.enjoy.structure.bridge.material.Plastic

/**
 *
 * @author Sophia
 * @time 2022/10/25
 */
class BridgeClient {
}

fun main() {
    //用塑料袋材质
//    val bag = BigBag(Paper())//可配置
//    val bag = BigBag(Plastic())//可配置
    val bag = SmallBag(Plastic())//可配置
    bag.pick()
}