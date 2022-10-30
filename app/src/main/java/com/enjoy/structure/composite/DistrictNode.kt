package com.enjoy.structure.composite

import java.io.Serializable

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 行政区节点
 */
class DistrictNode(name: String) : Node(name){

    private val children = arrayListOf<Node>()

    override fun getChildren(): List<Node> {
        return children
    }

    fun addChild(node: Node) {
        children.add(node)
    }

    fun delChild(i: Int) {
        children.removeAt(i)
    }
}