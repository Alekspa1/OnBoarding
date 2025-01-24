package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

fun main() {
    val averageStudentOne = 3
    val averageStudentTwo = 4
    val averageStudentThree = 3
    val averageStudentFour = 5
    val result: Double = (averageStudentOne + averageStudentTwo +
            averageStudentThree + averageStudentFour) / 4.0
    println((result * 100).roundToInt() / 100.0)

}
