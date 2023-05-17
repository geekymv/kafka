package study.basic.map

object Demo02Flatten {

  def main(args: Array[String]): Unit = {

    var list = List(Array("hello world"), Array("hello java"))
    var words = list.flatten

    println(words)

  }

}
