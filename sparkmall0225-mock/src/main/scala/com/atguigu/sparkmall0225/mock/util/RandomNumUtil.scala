package com.atguigu.sparkmall0225.mock.util

import java.util.Random

import scala.collection.mutable

/**
  * HF
  * 2019-07-17 20:49
  */
object RandomNumUtil {
  private val randow = new Random()


  def randowInt(from:Int,to:Int) = {
     if (from > to )  throw new IllegalArgumentException(s"from($from) 应该小于 to($to),黄爹您看啦")
    randow.nextInt(to-from+1) + from

  }

  def randowLong(from: Long,to:Long) = {
  if (from > to ) new IllegalArgumentException(s"from($from) 应该小于 to($to),黄爹您块看啊")
    randow.nextLong().abs%(to-from+1) + from
  }
def randomMultiInt(from:Int,to:Int,count:Int,canReat:Boolean=true) = {
  if(canReat){
    (1 to count).map(_=>randowInt(from,to)).toList
  }else{
      val set = mutable.Set[Int]()
    while (set.size<count){
      set += randowInt(from,to)

    }
    set.toList
  }
}


  def main(args: Array[String]): Unit = {


  }

}
