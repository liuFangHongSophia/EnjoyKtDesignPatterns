package com.enjoy.structure.facede

/**
 *
 * @author Sophia
 * @time 2022/10/26
 * 客户一条龙服务
 */
class OrderFacede {

    private val pickService = PickService()
    private val packService = PackService()
    private val sendService = SendService()

    fun doOrder() {
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

}