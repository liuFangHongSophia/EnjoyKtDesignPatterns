package com.enjoy.structure.proxy

import com.enjoy.service.OrderService
import com.enjoy.service.impl.OutOrderServiceImpl

/**
 *
 * @author Sophia
 * @time 2022/10/26
 */
class ProxyOrder : OrderService {
    //真实的订单服务
    val orderService = OutOrderServiceImpl()//获取海外服务

    override fun saveOrder(): Int {
        println("开始海外下订单....")
        return orderService.saveOrder()
    }

}