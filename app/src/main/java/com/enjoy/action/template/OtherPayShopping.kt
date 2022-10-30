package com.enjoy.action.template

import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 模板方法模式
 * 购物车费用结算过程
 */
class OtherPayShopping(products: ArrayList<Fruit>) : ShoppingCart(products) {

    override fun pay(money: Int) {
        println("代付成功！")
    }
}