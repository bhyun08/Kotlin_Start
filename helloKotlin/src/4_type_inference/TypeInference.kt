package `4_type_inference`

fun main() {

    var a = 1234 // 일반 정수형 리터럴은 int로 추론
    var b = 12345L // 리터럴이 Long형 이기에 Long으로 추론

    var c = 12.45 // 일반 실수형 리터럴은 double로 추론
    var d = 12.45f // 리터럴이 float이기에 float으로 추론

    var e = 0xABCD
    var f = 0b01110101 // 16진수와 2진수는 Int형으로 추론

    var g = true // boolean으로 추론
    var h = 'c' //char로 추론
    var i = "hello" // String으로 추론
}