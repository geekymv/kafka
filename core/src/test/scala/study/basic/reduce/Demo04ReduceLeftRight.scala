package study.basic.reduce

object Demo04ReduceLeftRight {

  /*
  reduce 可以并行计算，reduce 并行计算的结果可能和 reduceLeft 的不一致
  reduceLeft、reduceRight 不可以并行计算
   */
  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4)

    val num1 = arr.par.reduce((a, b) => {
      val name = Thread.currentThread().getName
      println(name, a, b)
      a - b
    })
    println(num1)
    println("--------------")


    val num2 = arr.par.reduceLeft((a, b) => {
      val name = Thread.currentThread().getName
      println(name, a, b)
      a - b
    })
    println(num2)
    println("--------------")


    val num3= arr.par.reduceRight((a, b) => {
      val name = Thread.currentThread().getName
      println(name, a, b)
      a - b
    })
    println(num3)

  }

}
