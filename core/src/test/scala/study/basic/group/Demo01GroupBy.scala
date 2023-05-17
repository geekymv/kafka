package study.basic.group

object Demo01GroupBy {

  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4)

    // 按照奇偶数分组
    val group: Map[String, Array[Int]] = arr.groupBy(t => {
      if (t % 2 == 0) "even" else "odd"
    })

    for((k, v) <- group) {
      println(k, v.toList)
    }

    // 计算每组的平均值
    val average: Map[String, Double] = group.map(t => (t._1, t._2.sum * 1.0 / t._2.length))
    for((k, v) <- average) {
      println(k, v)
    }

  }

}
