package com.enjoy.action.command.command

import com.enjoy.action.command.Command
import com.enjoy.action.command.handler.DiscountHandler

/**
 *
 * @author Sophia
 * @time 2022/10/29
 */
class DiscountCommand : Command() {

    private val handler = DiscountHandler()

    override fun execute(): String {
        return handler.getDiscounts()
    }
}