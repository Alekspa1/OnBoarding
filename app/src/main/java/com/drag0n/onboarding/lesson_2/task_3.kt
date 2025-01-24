package com.drag0n.onboarding.lesson_2

import java.util.Locale

const val QUANITY = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    println(converTime(departureHour, departureMinute, travelTime))


}

fun converTime(departureHour: Int, departureMinute: Int, travelTime: Int): String {

    val allMinute = (departureHour * QUANITY) + departureMinute + travelTime
    val arrivalHour = (allMinute / QUANITY)
    val arrivalMinute = (allMinute % QUANITY)

    return String.format(
        Locale.getDefault(),
        "%02d:%02d", arrivalHour, arrivalMinute
    )


}