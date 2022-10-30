package com.enjoy.structure.bridge.bag

import com.enjoy.structure.bridge.material.Material

/**
 *
 * @author Sophia
 * @time 2022/10/25
 * 采摘容器  桥接模式
 * 可扩展成三维数据匹配模式
 */
abstract class BagAbstraction(var material: Material) {
    abstract fun pick()
}