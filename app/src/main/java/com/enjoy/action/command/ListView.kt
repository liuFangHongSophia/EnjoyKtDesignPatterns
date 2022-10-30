package com.enjoy.action.command

/**
 *
 * @author Sophia
 * @time 2022/10/29
 */
class ListView {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun getList() {
        println("首页请求")
        val result = command?.execute()
        println("当前列表 $result")
    }

}