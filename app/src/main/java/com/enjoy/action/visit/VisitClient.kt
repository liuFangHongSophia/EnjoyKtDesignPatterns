package com.enjoy.action.visit

import com.enjoy.create.factory.simple.StaticFactory
import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Apple

/**
 *
 * @author Sophia
 * @time 2022/10/29
 */
class VisitClient {

    private val list = ArrayList<Fruit>()
    private val visit = Visit()

    fun init() {
        list.add(StaticFactory().getFruitApple())
        list.add(StaticFactory().getFruitBanana())
        list.add(StaticFactory().getFruitOrange())
    }

    //统计库存
    fun price(): Int {
        var total = 0
        for (fruit in list) {
//            total += visit.sell(fruit)
            total += fruit.accept(visit)
        }
        println("总价值：$total")
        return total
    }

    fun test1() {
        val apple = Apple(20)
        val fruit = apple
        var price = visit.sell(fruit)
        println("fruit价格：$price")

        price = visit.sell(apple)
        println("apple价格：$price")
    }

    fun test2() {
        val apple = Apple(20)
        val fruit = apple
        val price = fruit.accept(visit)
        println("价格：$price")

    }
}

fun main() {
//    VisitClient().init()
//    VisitClient().price()
    val visit = Visit()
    val products = ArrayList<Fruit>()
    products.add(StaticFactory().getFruitApple())
    products.add(StaticFactory().getFruitBanana())
    products.add(StaticFactory().getFruitOrange())
    products.add(StaticFactory().getFruitOrange())

    var total = 0
    for (fruit in products) {
//            total += visit.sell(fruit) //不能识别fruit对象的真实类型，导致获取价格总价值不正确
        total += fruit.accept(visit)
    }
    println("总价值：$total")

//    VisitClient().test2()
//    VisitClient().test1()
}