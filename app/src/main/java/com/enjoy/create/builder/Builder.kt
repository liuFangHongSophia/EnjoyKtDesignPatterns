package com.enjoy.create.builder

/**
 *
 * @author Sophia
 * @time 2022/10/18
 * 创建一个FruitMealBuilder类，实际的builder类负责创建套餐Meal对象
 */
interface Builder {
    //也是工厂模式
    fun buildApple(price: Int)//设置苹果价格
    fun buildBanana(price: Int)
    fun buildOrange(price: Int)

    fun getFruitMeal(): FruitMeal//返回创建的套餐

}