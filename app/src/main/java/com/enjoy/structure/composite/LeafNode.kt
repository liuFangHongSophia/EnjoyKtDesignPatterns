package com.enjoy.structure.composite


/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 叶子节点 终结点
 */
class LeafNode(name: String) : Node(name) {
    override fun getChildren(): List<Node> {
        return emptyList()
    }
}