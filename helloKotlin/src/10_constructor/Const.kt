package `10_constructor`

fun main() {

    var a = Person("Ama", 20)
    var b = Person("Bima", 20)
    var c = Person("Cima", 20)

    var d = Person("dio")
    var g = Person("Gamma")
    var h = Person("Hima")
}

class Person (var name: String, var age: Int) {
    init { // 생성자가 호출될때 실행되는 함수 init
        println("My name is $name and I am $age years old")
    }

    constructor(name: String) : this(name, 1997) { // 보조 생성자 선언
        println("보조 생성자 사용")
    }
}