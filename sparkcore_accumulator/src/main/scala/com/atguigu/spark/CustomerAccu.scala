package com.atguigu.spark

import java.util

import org.apache.spark.util.AccumulatorV2

class CustomerAccu extends AccumulatorV2[String,java.util.Set[String]]{
    
    //累加器内部数据结构是否为空
    override def isZero: Boolean = ???
    
    //让spark框架能够调用copy函数产生一个新的系统的类
    override def copy(): AccumulatorV2[String, util.Set[String]] = ???
    
    //重置累加器的数据结构
    override def reset(): Unit = ???
    
    //提供修改累加器的方法
    override def add(v: String): Unit = ???
    
    //用于合并多个分区的累加器实例
    override def merge(other: AccumulatorV2[String, util.Set[String]]): Unit = ???
    
    //通过value方法输出你的累加器信息的最终结果
    override def value: util.Set[String] = ???
}
