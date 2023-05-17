package study.basic.wordcount

object Demo01WordCount {

  def main(args: Array[String]): Unit = {

    var list = List("hello tom hello", "jack hi java scala flink")

    // 单词切分
    val wordLine: List[Array[String]] = list.map(t => t.split(" "))

    // 压平
    val words: List[String] = wordLine.flatten
    // val words: List[String] = list.flatMap(t => t.split(" "))

    // 根据单词分组
    val wordGroup: Map[String, List[String]] = words.groupBy(t => t)
    // 统计每组的单词个数
    // val wordCount: Map[String, Int] = wordGroup.mapValues(t => t.size)
    val wordCount: Map[String, Int] = wordGroup.map(t => (t._1, t._2.size))

    for((k, v) <- wordCount) {
      println(k, v)
    }
  }

}
