package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Bag
import com.enjoy.entity.bag.AppleBag

/**
 *
 * @author Sophia
 * @time 2022/10/18
 *  工厂方法模式
 */
class AppleBagFactory : BagFactory {
    override fun getBag(): Bag {
        return AppleBag()
    }
}