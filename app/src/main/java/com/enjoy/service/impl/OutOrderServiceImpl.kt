package com.enjoy.service.impl

import com.enjoy.service.OrderService

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 第三方 海外订单
 */
class OutOrderServiceImpl : OrderService {
    override fun saveOrder(): Int {
        println("下单成功，订单号：66666666666")
        return 6666666
    }
}