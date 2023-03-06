package study.basic.reduce

object Demo03ReduceLeftRight {

  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4)

    val num1 = arr.reduceLeft((a, b) => a - b)
    /*
    a b
    1 2 -> 1 - 2 = -1
    -1 3 -> -1 - 3 = -4
    -4 4 -> -4 - 4 = -8
     */
    println(num1)


    val num2 = arr.reduceRight((a, b) => {
//      println(a, b)
      a - b
    })
    /*
     a b
     3 4 -> 3 - 4 = -1
     2 -1 -> 2 - -1 = 3
     1 3 -> 1 - 3 = -2
     */
    println(num2)

  }

}
