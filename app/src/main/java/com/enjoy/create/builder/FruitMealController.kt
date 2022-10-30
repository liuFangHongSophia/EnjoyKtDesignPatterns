package com.enjoy.create.builder

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 导演类负责调用步骤  让创建过程模版化
 */
class FruitMealController { //收银台---

    private lateinit var builder: Builder

    fun construct() {
//        builder = OldCustomerBuilder() //可以配置多种套餐
        builder = HolidayBuilder();
        builder.buildApple(20)
        builder.buildBanana(50)
        builder.buildOrange(30)
        val fruitMeal = builder.getFruitMeal()

        val cost = fruitMeal.cost()
        println("本套餐花费：$cost")
    }
}

fun main() {
    FruitMealController().construct();
}