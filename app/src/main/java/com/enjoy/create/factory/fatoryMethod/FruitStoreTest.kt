package com.enjoy.create.factory.fatoryMethod


/**
 *
 * @author Sophia
 * @time 2022/10/18
 *  工厂方法模式
 */
class FruitStoreTest {


    lateinit var fruitFactory: FruitFactory
    lateinit var bagFactory: BagFactory

    //邮寄打包
    fun pack() {
        //初始化苹果工厂
        fruitFactory = AppleFactory()
        val fruit = fruitFactory.getFruit()
        fruit.draw()
        //初始化 苹果包装工厂
        bagFactory = AppleBagFactory()
        val bag = bagFactory.getBag();
        //打包
        bag.pack(fruit)

        //.....邮寄业务
    }

}

fun main() {
    FruitStoreTest().pack()
}