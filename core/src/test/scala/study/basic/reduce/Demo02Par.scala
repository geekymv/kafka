package study.basic.reduce

object Demo02Par {

  def main(args: Array[String]): Unit = {

    val arr = Array(1, 2, 3, 4)
    // par 并行执行
    val sum = arr.par.reduce((a, b) => {
      val name: String = Thread.currentThread().getName
      println(name, a, b)
      a + b
    })
    println(sum)

  }

}
