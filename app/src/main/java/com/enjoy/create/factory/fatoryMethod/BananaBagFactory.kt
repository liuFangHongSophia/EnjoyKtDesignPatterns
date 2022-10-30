package com.enjoy.create.factory.fatoryMethod

import com.enjoy.entity.Bag
import com.enjoy.entity.bag.BananaBag

/**
 *
 * @author Sophia
 * @time 2022/10/18
 */
class BananaBagFactory:BagFactory {
    override fun getBag(): Bag {
       return BananaBag()
    }
}