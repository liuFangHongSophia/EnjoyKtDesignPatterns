package com.enjoy.action.strategy

/**
 *
 * @author Sophia
 * @time 2022/10/28
 */
interface Discount {
    fun calculate(money: Int): Int
}