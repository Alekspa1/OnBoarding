package com.drag0n.onboarding.lesson_3

fun main() {
    val response = "D2-D4;0"
    val from = response.split("-")[0]
    val where = response.split("-")[1].split(";")[0]
    val moveNumber = response.split("-")[1].split(";")[1]

    println(from)
    println(where)
    println(moveNumber)
}