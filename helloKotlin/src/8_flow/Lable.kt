package `8_flow`

fun main() {

    loop@for( i in 1..10) { // 레이블 지정
        for (j in 1..10) {
            if(i == 1 && j == 2) break@loop // 해당 레이블로 탈출
            println("$i $j") // 쌍따옴표 안에서는 변수앞에 달러사인을 붙여주면 변수로 출력
        }
    }
}