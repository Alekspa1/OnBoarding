package com.drag0n.onboarding.lesson_1

fun main() {
    val yearOfSpaceFlight = 1961
    var hourOfSpaceFlight = 9
    var minuteOfSpaceFlight = 7

    println("Год полета $yearOfSpaceFlight\n" +
            "Час полета ${hourOfSpaceFlight.toString().map { "0$it" }.joinToString()}\n" +
            "Минута полета ${minuteOfSpaceFlight.toString().map { "0$it" }.joinToString()}")


    hourOfSpaceFlight = 10
    minuteOfSpaceFlight = 55
    println("$hourOfSpaceFlight:$minuteOfSpaceFlight")


}