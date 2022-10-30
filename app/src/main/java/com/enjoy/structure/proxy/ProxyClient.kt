package com.enjoy.structure.proxy

/**
 *
 * @author Sophia
 * @time 2022/10/26
 */
class ProxyClient {

    fun saveOrder() {
        //本地代理类
        val orderService = ProxyOrder()
        orderService.saveOrder()
        //其他业务....
    }

}

fun main() {
    ProxyClient().saveOrder()
}