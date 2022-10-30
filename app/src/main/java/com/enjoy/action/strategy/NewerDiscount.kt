package com.enjoy.action.strategy

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减
 */
class NewerDiscount : Discount {
    override fun calculate(money: Int): Int {
        if (money > 200) {
            println("新人优惠价减免10元")
            return money - 10
        }
        return money
    }
}