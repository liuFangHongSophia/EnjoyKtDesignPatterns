package com.enjoy.structure.composite

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 组合模式
 */
abstract class Node(var name: String) {

    abstract fun getChildren(): List<Node>?

}