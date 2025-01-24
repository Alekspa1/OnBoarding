package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

fun main() {

    val baff = 1.4
    val crystal = 7
    val iron = 11

    println("Количество бонусных кристаллов: ${ countBaf(crystal, baff) }")
    println("Количество бонусной железной руды: ${ countBaf(iron, baff) }")

}
fun countBaf(quantity: Int, baf: Double): Int {
    return ((quantity*baf) - quantity).roundToInt()
}