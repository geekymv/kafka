package study.basic.map

object Demo03FlatMap {

  // flatMap = map + flatten
  def main(args: Array[String]): Unit = {

    var list = List("hello tom hello", "jack hi java scala flink")

    val words: List[String] = list.flatMap(t => t.split(" "))
    println(words)

  }

}
