package `8_flow`

fun main() {

    for(i in 1..10) {
        if(i == 3) continue // i가 3이되면 건너뛰기 탈출
        println(i)
    }
}

