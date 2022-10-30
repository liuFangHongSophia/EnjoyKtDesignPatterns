package com.enjoy.action.chain

import com.enjoy.action.strategy.Discount

/**
 *
 * @author Sophia
 * @time 2022/10/28
 * 责任链模式
 */
abstract class MultiDiscount(val nextMultiDiscount: MultiDiscount?) : Discount {

    override fun calculate(money: Int): Int {
        return this.nextMultiDiscount?.calculate(money) ?: money
    }

}