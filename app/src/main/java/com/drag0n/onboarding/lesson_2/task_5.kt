package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

var money = 70000.0
const val interestRate = 0.167
const val year = 20

fun main() {
    println( contribution(year))
}

fun contribution (year: Int) : Double{
    for (i in 1..year){
        money+= money* interestRate
    }
    return (money * 1000.0).roundToInt() / 1000.0
}