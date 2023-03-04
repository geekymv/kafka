package study.basic.wordcount

object Demo02WordCount {

  def main(args: Array[String]): Unit = {

    var list = List("hello tom hello", "jack hi java scala flink")

    val words = list.flatMap(t => t.split(" "))
    val wordCount = words.groupBy(t => t).mapValues(t => t.size)

    for((k, v) <- wordCount) {
      println(k, v)
    }
  }

}
