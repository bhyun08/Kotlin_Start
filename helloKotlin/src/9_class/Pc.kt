package `9_class`

fun main() {

    var a = Person("Alice", 29) // 인스턴스 생성
    var b = Person("Bob", 30)

    println("hello, I'm ${a.birthDayYear}th, ${a.name}")
    println("hello, I'm ${b.birthDayYear}th, ${b.name}")
}

class Person(var name: String, var birthDayYear: Int) {

}