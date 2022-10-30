package com.enjoy.entity.bag

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
open class OrangeBag : Bag {

    override fun pack(fruit: Fruit) {
        println("橙子包装...")
    }
}