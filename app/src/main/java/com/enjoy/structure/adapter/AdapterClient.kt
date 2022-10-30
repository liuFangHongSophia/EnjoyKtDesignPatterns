package com.enjoy.structure.adapter

import com.enjoy.entity.bag.AppleBag
import com.enjoy.entity.bag.OrangeBag
import com.enjoy.entity.fruit.Orange

/**
 *
 * @author Sophia
 * @time 2022/10/25
 * 将橘子包装盒伪装成苹果包装盒
 */
class AdapterClient {

    //取橘子包装盒
    fun getBag(): OrangeBag {
        return OrangeBag()
    }

    //用橘子包装盒包装苹果
    fun getBag2(): OrangeBag {
        val appleBag = AppleBag()
        return OrangeBagAdapter(appleBag)
    }

}

fun main() {
    val orange = Orange("peter", 100)
    val orangeBag = AdapterClient().getBag2()
    orangeBag.pack(orange)
}


