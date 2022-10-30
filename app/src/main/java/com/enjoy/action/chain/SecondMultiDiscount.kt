package com.enjoy.action.chain

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 满减
 */
class SecondMultiDiscount(nextMultiDiscount: MultiDiscount?) : MultiDiscount(nextMultiDiscount) {
    override fun calculate(money: Int): Int {
        var price: Int = money
        println("第二个9折优惠...")
        price = (money * 0.9).toInt()

        return super.calculate(price)
    }
}