package com.enjoy.service.impl

import com.enjoy.service.OrderService

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 本地订单
 */
class OrderServiceImpl : OrderService {
    override fun saveOrder(): Int {
        println("下单成功，订单号：88888888")
        return 888888
    }
}