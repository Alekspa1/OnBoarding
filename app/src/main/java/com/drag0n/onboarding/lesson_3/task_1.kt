package com.drag0n.onboarding.lesson_3

enum class TimesOfDay {
    DAY, EVENING
}

var greetings = ""
var user = "Алексадр"

fun main() {
    welcome(TimesOfDay.DAY)
    welcome(TimesOfDay.EVENING)

}

fun welcome(time: TimesOfDay) {
    greetings = when (time) {
        TimesOfDay.DAY -> "Добрый день"
        TimesOfDay.EVENING -> "Добрый вечер"
    }
    println("$greetings $user")
}