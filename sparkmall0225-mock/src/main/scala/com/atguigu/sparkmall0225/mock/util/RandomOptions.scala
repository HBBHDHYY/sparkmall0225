package com.atguigu.sparkmall0225.mock.util

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * HF
  * 2019-07-18 10:03
  */
object RandomOptions {
  def apply[T](opts:(T,Int)*):RandomOptions[T] = {
    val randomOptions = new RandomOptions[T]()
    randomOptions.totalWeight = (0 /: ops)(_ + _._2)
    opts.foreach{
      case (value,weight)=>randomOptions.options ++= (1 to weight).map(_=>value)
    }
    randomOptions

  }

}
class RandomOptions[T]{
  var totalWeight: Int = _
  var options = mutable.ListBuffer[T]()
  def getRandomOption() = {
    options(RandomNumUtil.randowInt(0,totalWeight-1))
  }

}