package com.enjoy.entity.fruit

import com.enjoy.action.visit.Visit
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
class Apple(var price: Int) : Fruit {

    override fun draw() {
        println("我是红富士苹果...")
    }

    override fun price(): Int {
        return price
    }

    override fun accept(visit: Visit): Int {
        return visit.sell(this) //指针可以传递真实类型
    }

}

//fun main() {
//    val visit = Visit()
//    Apple(20).accept(visit)
//}