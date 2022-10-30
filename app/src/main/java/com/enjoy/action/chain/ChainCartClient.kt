package com.enjoy.action.chain

import com.enjoy.action.template.OtherPayShopping
import com.enjoy.entity.Fruit
import com.enjoy.create.factory.simple.StaticFactory
import com.enjoy.action.chain.NewerMultiDiscount as NewerMultiDiscount

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 责任链模式 使用
 */
class ChainCartClient {


}

fun main() {

    val multiDiscount = FullMultiDiscount(null)

    val multiDiscount1 = NewerMultiDiscount(multiDiscount)
    val multiDiscount2 = SecondMultiDiscount(multiDiscount1)
    val multiDiscount3 = HolidayMultiDiscount(multiDiscount2)


    val products = ArrayList<Fruit>()
    products.add(StaticFactory().getFruitApple())
    products.add(StaticFactory().getFruitBanana())
    products.add(StaticFactory().getFruitOrange())

//    val cart = CartShopping(products)//可配置支付方式
    val cart = OtherPayShopping(products)
    //注入优惠方案
//    cart.discount = FullDiscount()
//    cart.discount = SecondDiscount()
    val discountType = "second"//避免了if else 来选方案
    cart.discount = multiDiscount3
    cart.submitOrder()
}