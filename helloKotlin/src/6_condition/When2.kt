package `6_condition`

fun main() {
    doWhenn(1)
    doWhenn("DinMo")
    doWhenn(12L)
    doWhenn(3.1234)
    doWhenn("Kotlin")

}

fun doWhenn (a: Any) {
    var result = when (a) { // 변수에 when 조건문을 할당
        1 -> "정수 1입니다."
        "DinMo" -> "디모의 코틀린 강좌입니다."
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result) // 출력
}