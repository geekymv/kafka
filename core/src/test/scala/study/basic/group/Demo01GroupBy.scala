package study.basic.group

object Demo01GroupBy {

  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4)

    // 按照奇偶数分组
    val group = arr.groupBy(t => {
      if (t % 2 == 0) "even" else "odd"
    })

    for((k, v) <- group) {
      println(k, v.toList)
    }

  }

}
