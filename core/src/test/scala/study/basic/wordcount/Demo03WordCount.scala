package study.basic.wordcount

import scala.io.Source

object Demo03WordCount {

  def main(args: Array[String]): Unit = {

    // 读取文件内容
    val lines: Iterator[String] = Source.fromFile("data/words.txt").getLines()

    val words: Iterator[String] = lines.flatMap(t => t.split(" "))

    // 每个单词1个
    val wordTuples: Iterator[(String, Int)] = words.map(t => (t, 1))

    val wordList: List[(String, Int)] = wordTuples.toList

    // 根据单词分组
    val wordMap: Map[String, List[(String, Int)]] = wordList.groupBy(t => t._1)

    // 统计每个单词个数
//    val wordCount: Map[String, Int] = wordMap.mapValues(t => t.size)
    val wordCount: Map[String, Int] = wordMap.mapValues(v => v.map(n => n._2).sum)

    wordCount.foreach(println)

  }

}
