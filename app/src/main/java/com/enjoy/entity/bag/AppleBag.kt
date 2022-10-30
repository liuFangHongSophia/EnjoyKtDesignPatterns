package com.enjoy.entity.bag

import com.enjoy.entity.Bag
import com.enjoy.entity.Fruit

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
class AppleBag : Bag {

    override fun pack(fruit: Fruit) {
        println("苹果包装...")
    }
}