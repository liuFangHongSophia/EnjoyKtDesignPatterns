package com.enjoy.structure.bridge.bag

import com.enjoy.structure.bridge.material.Material

/**
 *
 * @author Sophia
 * @time 2022/10/25
 *  桥接模式
 */
class MidBag(material: Material) : BagAbstraction(material) {
    override fun pick() {
        println("采摘水果开始")
        this.material.draw()
        println("采摘了一个中型袋子")
    }
}