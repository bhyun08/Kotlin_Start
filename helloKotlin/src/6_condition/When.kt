package `6_condition`

fun main() {
    doWhen(1)
    doWhen("DinMo")
    doWhen(12L)
    doWhen(3.1234)
    doWhen("Kotlin")

}

fun doWhen (a: Any) { // Any : 어떤 자료형이든 상관없는 코틀린의 최상위 자료형
    when (a) { // 다중 조건문 when
        1 -> println("정수 1입니다.")
        "DinMo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}