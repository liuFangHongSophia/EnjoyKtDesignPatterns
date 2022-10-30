package com.enjoy.action.command

import com.enjoy.action.command.command.DiscountCommand
import com.enjoy.action.command.command.HotCommand
import com.enjoy.action.command.command.NewerCommand

/**
 *
 * @author Sophia
 * @time 2022/10/28
 */
class CommandClient {

}

fun main() {
    //三个命令，代表三个请求
    val command1 = HotCommand()
    val command2 = NewerCommand()
    val command3 = DiscountCommand()
    val listView = ListView()

    listView.setCommand(command2)
    listView.getList()
}