package `9_class`

fun main() {

    var a = Personn("Alice", 29)
    var b = Personn("Bob", 30)

    a.introduce() // 메서드 호출
    b.introduce()
}

class Personn(var name: String, var birthDayYear: Int) {
    fun introduce () { // 메서드 생성
        println("hello, I'm ${birthDayYear}th, ${name}")
    }
}

