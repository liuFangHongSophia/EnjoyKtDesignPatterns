package com.enjoy.create.builder

import com.enjoy.entity.fruit.Apple
import com.enjoy.entity.fruit.Banana
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 建造者模式，按流程执行起来
 */
class FruitMeal {
    /*lateinit 用这个延时初始化不行,报错 lateinit property apple has not been initialized*/
//    private lateinit var banana: Banana
//    private lateinit var orange: Orange

    private var apple: Apple? = null //苹果---价格
    private var banana: Banana? = null
    private var orange: Orange? = null

    private var discount: Int = 0 //折扣价
    private var totalPrice: Int = 0//套餐总价

    fun setDiscount(discount: Int) {
        this.discount = discount;
    }

    fun setApple(apple: Apple) {
        this.apple = apple
    }

    fun setBanana(banana: Banana) {
        this.banana = banana
    }

    fun setOrange(orange: Orange) {
        this.orange = orange
    }

    fun cost(): Int {
        return this.totalPrice
    }


    fun init() {
        totalPrice += apple?.price ?: 0

        totalPrice += orange?.price ?: 0

        totalPrice += banana?.price ?: 0

        if (totalPrice > 0) {
            totalPrice -= discount
        }
    }

    fun showItems() {
        println("totalPrice: $totalPrice")
    }

}