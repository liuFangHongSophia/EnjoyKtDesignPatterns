package com.enjoy.action.strategy

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减
 */
class FullDiscount : Discount {
    override fun calculate(money: Int): Int {
        if (money > 200) {
            println("优惠减免20元")
            return money - 20
        }
        return money
    }
}