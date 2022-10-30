package com.enjoy.action.visit

import com.enjoy.entity.Fruit
import com.enjoy.entity.fruit.Apple
import com.enjoy.entity.fruit.Banana
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/29
 * 方法重载 参数不一样
 */
class Visit {

    fun sell(apple: Apple): Int {
        println("apple's price:￥50")
        return 50
    }

    fun sell(orange: Orange): Int {
        println("orange's price:￥20")
        return 20
    }

    fun sell(banana: Banana): Int {
        println("orange's price:￥30")
        return 30
    }

    //其他水果的价格
    fun sell(fruit: Fruit): Int {
        println("other's price:￥10")
        return 10
    }
}