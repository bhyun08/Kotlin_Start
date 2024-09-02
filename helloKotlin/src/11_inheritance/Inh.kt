package `11_inheritance`

fun main() {
    var a = Animal("별이",5,"개")
    var b = Dog("별이",5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("루이",1)
    c.meow()
}

open class Animal (var name: String, var age: Int, var type: String) { // open으로 상속 허용
    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog (name: String, age: Int) : Animal(name,age,"개") { // 상속
    fun bark() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal(name,age,"고양이") { // 상속
    fun meow() {
        println("냐옹")
    }
}