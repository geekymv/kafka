package study.`class`

class Student(val name: String, var age: Int, desc: String) {

    def this(name: String, age: Int) {
        this(name, age, "")
    }

    def sayHello(): Unit = {

    }

}
