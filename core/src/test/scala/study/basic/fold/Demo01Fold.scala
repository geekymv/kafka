package study.basic.fold

object Demo01Fold {

  /*
  fold 和 reduce 类似，多了一个初始值
   */
  def main(args: Array[String]): Unit = {

    var arr = Array(1, 2, 3, 4)
    val s1 = arr.fold(0)((a, b) => a + b)
    println(s1) // 10

    val s2 = arr.fold(2)((a, b) => a + b)
    println(s2) // 12

  }
}
