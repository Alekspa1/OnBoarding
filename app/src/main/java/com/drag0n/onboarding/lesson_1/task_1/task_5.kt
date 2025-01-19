package com.drag0n.onboarding.lesson_1.task_1

fun main() {
    val second = 6480
    var hour= 0
    var minute = 0
    var secondCosmos = 0
    for (i in 0..<second) {
        secondCosmos++
        if (secondCosmos == 60 ) {
            minute++
            secondCosmos = 0
        }
        if (minute == 60 ) {
            hour++
            minute = 0
        }
    }

    println(
        hour.toString().map { "0$hour"}.joinToString() +
            ":$minute" +
            ":${ secondCosmos.toString().map { "0$secondCosmos" }.joinToString()}")
}