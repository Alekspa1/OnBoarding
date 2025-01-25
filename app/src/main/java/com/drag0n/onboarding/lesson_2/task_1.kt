package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

fun main() {
    val NUMBER_OF_STUDENTS = 4
    val englishScoreStudentOne = 3
    val englishScoreStudentTwo = 4
    val englishScoreStudentThree = 3
    val englishScoreStudentFour = 5
    val result: Float = (englishScoreStudentOne + englishScoreStudentTwo +
            englishScoreStudentThree + englishScoreStudentFour).toFloat() / NUMBER_OF_STUDENTS
    println(result)

}
