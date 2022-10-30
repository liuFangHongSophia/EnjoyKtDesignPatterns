package com.enjoy.action.chain

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减 新人优惠价减免10元
 */
class NewerMultiDiscount(nextMultiDiscount: MultiDiscount?) : MultiDiscount(nextMultiDiscount) {
    override fun calculate(money: Int): Int {
        var price: Int
        price = money
        if (money > 200) {
            println("新人优惠价减免10元")
            price = money - 10
        }
        return super.calculate(price)
    }
}