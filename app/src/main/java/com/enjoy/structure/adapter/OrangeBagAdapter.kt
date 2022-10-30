package com.enjoy.structure.adapter

import com.enjoy.entity.Fruit
import com.enjoy.entity.bag.AppleBag
import com.enjoy.entity.bag.OrangeBag

/**
 *
 * @author Sophia
 * @time 2022/10/25
 * 橘子包装适配器
 * 适配器模式
 */
class OrangeBagAdapter(var appleBag: AppleBag) : OrangeBag() {
    override fun pack(fruit: Fruit) {
        appleBag.pack(fruit)
    }
}
