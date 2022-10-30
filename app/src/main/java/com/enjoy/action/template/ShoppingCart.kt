package com.enjoy.action.template

import com.enjoy.action.strategy.Discount
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 主框架设计完成 父类
 */
abstract class ShoppingCart(val products: ArrayList<Fruit>) {

    var discount: Discount?=null


    //提交订单
    fun submitOrder() {
        //计算商品金额
        var money = balance()
        println("需要支付总金额为：$money 元")

        //优惠减免
        money = discount?.calculate(money) ?: money
        println("优惠减免后：$money 元")

        //保存订单
        pay(money)

        //送货上门
        sendHome()
    }

    abstract fun pay(money: Int) //方便后期扩展

    private fun sendHome() {
        println("三公里以内，免费送货上门")
    }

    private fun balance(): Int {
        var money = 0
        println("商品清单")

        for (fruit in products) {
            fruit.draw()
            println(",")
            money += fruit.price()
        }
        return money
    }

}