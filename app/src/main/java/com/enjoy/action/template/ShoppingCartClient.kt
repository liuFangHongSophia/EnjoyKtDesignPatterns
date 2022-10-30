package com.enjoy.action.template

import com.enjoy.action.strategy.Discount
import com.enjoy.action.strategy.FullDiscount
import com.enjoy.action.strategy.NewerDiscount
import com.enjoy.action.strategy.SecondDiscount
import com.enjoy.entity.Fruit
import com.enjoy.create.factory.simple.StaticFactory

/**
 *
 * @author Sophia
 * @time 2022/10/26
 *  模板方法模式
 * 订单费用结算过程
 * 不需要更改业务代码，只需要
 */
class ShoppingCartClient {


}

fun main() {
    // 策略模式
    val discounts: HashMap<String, Discount> = HashMap()
    discounts.put("full", FullDiscount())
    discounts["newer"] = NewerDiscount()
    discounts.put("second", SecondDiscount())

    val products = ArrayList<Fruit>()
    products.add(StaticFactory().getFruitApple())
    products.add(StaticFactory().getFruitBanana())
    products.add(StaticFactory().getFruitOrange())

//    val cart = CartShopping(products)//可配置支付方式
    val cart = OnlineShopping(products)

    //注入优惠方案
//    cart.discount = FullDiscount()
//    cart.discount = SecondDiscount()
    val discountType = "second"//避免了if else 来选方案
    cart.discount = discounts[discountType]

    cart.submitOrder()
}


