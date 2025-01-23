package com.drag0n.onboarding.lesson_1

import java.util.Locale

    const val QUANTITY = 60
    const val QUANTITY_SECOND = QUANTITY*6

fun main() {
    val second = 6480
    val hour = second/ QUANTITY_SECOND
    val minute = (second % QUANTITY_SECOND) / QUANTITY
    val secondCosmos = second % QUANTITY

    println(String.format(Locale.getDefault(),
        "%02d:%02d:%02d", hour, minute, secondCosmos))

}

