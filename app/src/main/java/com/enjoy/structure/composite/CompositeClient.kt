package com.enjoy.structure.composite

import com.google.gson.Gson


/**
 *
 * @author Sophia
 * @time 2022/10/26
 */
class CompositeClient {
    fun senFruit() {
        var root = DistrictNode("根")
        //一线及目录
        root.addChild(DistrictNode("上海"))
        root.addChild(DistrictNode("天津"))
        val districtNode = DistrictNode("北京")
        root.addChild(districtNode)
        //二级目录
        districtNode.addChild(DistrictNode("海定区"))
        districtNode.addChild(DistrictNode("西城区"))
        val districtNode2 = DistrictNode("朝阳区")
        districtNode.addChild(districtNode2)

        //三级目录
        districtNode2.addChild(LeafNode("三里屯"))
        districtNode2.addChild(LeafNode("朝阳外街"))

        println(Gson().toJson(root))
        //以下时物流运输业务...

    }
}

fun main() {
    CompositeClient().senFruit()
    //{"children":[{"children":[],"name":"上海"},{"children":[],"name":"天津"},{"children":[{"children":[],"name":"海定区"},{"children":[],"name":"西城区"},{"children":[{"children":[],"name":"三里屯"},{"children":[],"name":"朝阳外街"}],"name":"朝阳区"}],"name":"北京"}],"name":"根"}
}