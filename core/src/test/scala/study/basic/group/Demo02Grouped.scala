package study.basic.group

object Demo02Grouped {

  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4, 5)
    // 每3个一组
    val itr: Iterator[Array[Int]] = arr.grouped(3)

    itr.foreach(t => println(t.toList))

  }

}
