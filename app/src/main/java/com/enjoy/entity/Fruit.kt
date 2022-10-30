package com.enjoy.entity

import com.enjoy.action.visit.Visit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 *
 * 使用者只知道接口类不知道对应的对象
 */
interface Fruit {
    fun draw()
    fun price(): Int

    fun accept(visit: Visit): Int//访问者模式需要
}