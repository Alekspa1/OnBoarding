package com.drag0n.onboarding.lesson_1

import java.util.Locale

const val QUANTITY = 60

fun main() {
    val second = 6480
    val hour = second / 3600
    val minute = (second % 3600) / QUANTITY
    val secondCosmos = second % QUANTITY

    println(
        String.format(
            Locale.getDefault(),
            "%02d:%02d:%02d", hour, minute, secondCosmos
        )
    )
}