package study.basic.aggregate

object Demo01Aggregate {

  def main(args: Array[String]): Unit = {

    wordTotal()
  }

  def wordTotal(): Unit = {
    var words = Array(("word", 1), ("hello", 2), ("hi", 3))
    // (a, b) => a + b._2 a是初始值0
    // (a, b) => a + b a,b 分别是局部聚合结果
    val total = words.aggregate(0)((a, b) => a + b._2, (a, b) => a + b)
    println(total)
  }

  def sum1(): Unit = {
    var arr = Array(1, 2, 3, 4)

    /*
    z: 初始值
    seqop: 局部聚合
    combop: 全局聚合
     */
    val sum = arr.par.aggregate(0)((a, b) => {
      val name: String = Thread.currentThread().getName
      println("seqop", name, a, b)
      a + b
    }, (a, b) => {
      val name: String = Thread.currentThread().getName
      println("combop", name, a, b)
      a + b
    })
    println(sum)
  }

}
