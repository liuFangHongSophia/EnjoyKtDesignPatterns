package com.enjoy.action.command.command

import com.enjoy.action.command.Command
import com.enjoy.action.command.handler.NerwerHandler

/**
 *
 * @author Sophia
 * @time 2022/10/29
 */
class NewerCommand : Command() {
    private val handler = NerwerHandler()
    override fun execute(): String {
        return handler.getDiscounts()
    }

}