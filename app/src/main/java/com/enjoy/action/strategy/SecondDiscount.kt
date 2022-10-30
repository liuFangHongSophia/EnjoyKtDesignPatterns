package com.enjoy.action.strategy

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减
 */
class SecondDiscount : Discount {
    override fun calculate(money: Int): Int {
        val balance = money * 0.9
        println("第二个9折优惠...")

        return balance.toInt()
    }
}