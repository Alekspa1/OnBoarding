package com.drag0n.onboarding.lesson_2

import kotlin.math.roundToInt

fun main() {
    data class Worker(
        val jobTotle: String,
        val salary: Int)

    val listWorker = mutableListOf<Worker>()
    for (i in 1..50) listWorker.add(Worker("Master",30000))
    for (i in 1..20) listWorker.add(Worker("Intern",20000))

    val expensesSalaryMaster = listWorker.filter { it.jobTotle == "Master" }.sumOf { it.salary }
    val expensesSalaryAll = listWorker.sumOf { it.salary }
    val expensesSalaryaverage = listWorker.map { it.salary }.average().roundToInt()

    println(expensesSalaryMaster)
    println(expensesSalaryAll)
    println(expensesSalaryaverage)
}