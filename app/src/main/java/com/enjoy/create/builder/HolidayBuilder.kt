package com.enjoy.create.builder

import com.enjoy.entity.fruit.Apple
import com.enjoy.entity.fruit.Banana
import com.enjoy.entity.fruit.Orange


/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 建造者模式
 */
class HolidayBuilder : Builder {
    private val fruitMeal = FruitMeal()

    override fun buildApple(price: Int) {
        val fruit = Apple(20)
        fruit.price = price
        fruitMeal.setApple(fruit)
    }

    override fun buildBanana(price: Int) {
        val fruit = Banana(20)
        fruit.price = price
        fruitMeal.setBanana(fruit)
    }

    override fun buildOrange(price: Int) {
        val fruit = Orange("Peter", 80)
        fruit.price = price
        fruitMeal.setOrange(fruit)
    }

    override fun getFruitMeal(): FruitMeal {
        fruitMeal.setDiscount(15)
        fruitMeal.init()
        return fruitMeal
    }
}