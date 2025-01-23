package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

fun main() {
    val averageStudentOne = 3
    val averageStudentTwo = 4
    val averageStudentThree = 3
    val averageStudentFour = 5
    println(averageGPA(averageStudentOne,averageStudentTwo,averageStudentThree,averageStudentFour))
}
fun averageGPA(
    averageOne:Int,
    averageTwo:Int,
    averageThree:Int,
    averageFour:Int): Double {
    val result: Double = (averageOne+averageTwo+
            averageThree+averageFour)/4.0
    return (result*100).roundToInt()/100.0
}