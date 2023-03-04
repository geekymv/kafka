package study.basic.mapvalues

object Demo01MapValues {

  def main(args: Array[String]): Unit = {

    val data = Map(("zhangan", 8000), ("lisi", 12000))

    // 只对 map 的值进行操作
    val res = data.mapValues(t => t + 1000)
    println(res)

  }
}
