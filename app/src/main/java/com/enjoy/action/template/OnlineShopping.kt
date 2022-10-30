package com.enjoy.action.template

import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 模板方法模式
 * 购物车费用结算过程
 */
class OnlineShopping(products: ArrayList<Fruit>) : ShoppingCart(products) {

    override fun pay(money: Int) {
        println("微信/支付宝结算，减免5元，请支付：${money - 5} 元")
    }
}