package com.enjoy.action.command.command

import com.enjoy.action.command.Command
import com.enjoy.action.command.handler.HotHandler

/**
 *
 * @author Sophia
 * @time 2022/10/29
 * 命令式模式
 */
class HotCommand : Command() {
    private val handler = HotHandler()
    override fun execute(): String {
        return handler.getDiscounts()
    }
}