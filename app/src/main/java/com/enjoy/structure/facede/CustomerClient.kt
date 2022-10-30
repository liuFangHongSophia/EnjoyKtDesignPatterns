package com.enjoy.structure.facede

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 客户服务一条龙
 */
class CustomerClient {

    fun doOrder() {
        val pickService = PickService()
        val packService = PackService()
        val sendService = SendService()

        //采摘
        println("————————")
        pickService.doPick()

        //包装
        println("————————")
        packService.doPack()

        //快递
        println("————————")
        sendService.doSend()

    }


    fun doOrderFace() {
        val orderFace = OrderFacede()
        orderFace.doOrder()
    }
}

fun main() {
    CustomerClient().doOrderFace()
}