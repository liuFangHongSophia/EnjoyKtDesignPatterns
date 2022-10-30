package com.enjoy.entity.fruit

import com.enjoy.action.visit.Visit
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
class Orange(val name: String, var price: Int) : Fruit {
    override fun draw() {
        println("我是橙子...$name 在吃，需要花费$price 元")
    }

    override fun price(): Int {
        return price
    }

    override fun accept(visit: Visit): Int {
        return visit.sell(this)//指针可以传递真实类型
    }
}