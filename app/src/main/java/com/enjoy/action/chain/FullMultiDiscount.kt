package com.enjoy.action.chain

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减
 */
class FullMultiDiscount(nextMultiDiscount: MultiDiscount?) : MultiDiscount(nextMultiDiscount) {
    override fun calculate(money: Int): Int {
        var price: Int
        price = money
        if (money > 200) {
            println("优惠减免20元")
            price = money - 20
        }
        return super.calculate(price)

    }
}