package com.drag0n.onboarding.lesson_3

fun main() {
    var value = 9

    fun calc (value: Int): String{
        var table = ""
        for (i in 1..9) table+= "$value * $i = ${value*i}\n"
        return table
    }
    println(calc(value))

}