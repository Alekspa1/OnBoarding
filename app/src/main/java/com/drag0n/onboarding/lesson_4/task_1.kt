package com.drag0n.onboarding.lesson_4
    const val all = 13
fun main() {

    val reservedToday = 13
    val reservedTomorrow = 9
    val result = "" +
            "Доступность столиков на сегодня: ${availability(reservedToday)}\n" +
            "Доступность столиков на завтра: ${availability(reservedTomorrow)}"

    println(result)
}

fun availability(numberOfTables: Int): Boolean {
    return if (numberOfTables == all) false
    else (numberOfTables < all)
}