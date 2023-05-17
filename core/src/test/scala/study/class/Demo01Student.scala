package study.`class`

object Demo01Student {

    def main(args: Array[String]): Unit = {
        var s = new Student("tom", 20, "hello scala")
        println(s.name, s.age)

        var s2 = new Student("jack", 18)
        println(s.name, s.age)
    }

}
