package com.drag0n.onboarding.lesson_1

import java.util.Locale

fun main() {
    val second = 6480
    val hour = second/3600
    val minute = (second % 3600) / 60
    val secondCosmos = second % 60

    println(String.format(Locale.getDefault(),
        "%02d:%02d:%02d", hour, minute, secondCosmos))
}