package study.basic.reduce

object Demo01Reduce {

  def main(args: Array[String]): Unit = {

    max()

  }

  def sum(): Unit = {
    val arr = Array(1, 2, 3, 4)
    val sum = arr.reduce((a, b) => a + b) // 参数类型和返回值类型需要一致
    println(sum)
    /*
    a b
    1 2 -> 1 + 2= 3
    3 3 -> 3 + 3 = 6
    6 4 -> 6 + 4 = 10
     */
  }

  def max(): Unit = {
    val arr = Array(1, 2, 3, 4)
    val max: Int = arr.reduce((a, b) => if (a > b) a else b)
    println(max)
  }

}
