package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Bag

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
interface BagFactory {
    fun getBag(): Bag  //包装指令
}