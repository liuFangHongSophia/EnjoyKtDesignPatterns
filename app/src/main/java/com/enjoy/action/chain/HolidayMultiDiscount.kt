package com.enjoy.action.chain

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 节假日一律减5元
 */
class HolidayMultiDiscount(nextMultiDiscount: MultiDiscount?) : MultiDiscount(nextMultiDiscount) {
    override fun calculate(money: Int): Int {
        var price: Int
        price = money
        if (money > 20) {
            println("节假日一律减5元")
            price = money - 5
        }
        return nextMultiDiscount?.calculate(price) ?: price

    }
}