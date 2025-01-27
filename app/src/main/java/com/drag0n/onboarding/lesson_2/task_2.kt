package com.drag0n.onboarding.lesson_2


fun main() {
    val numberOfMaster = 50
    val numberOfIntern = 30
    val salaryMaster = 30000
    val salaryIntern = 20000

    val expensesSalaryMaster = numberOfMaster * salaryMaster
    val expensesSalaryAll = expensesSalaryMaster + (numberOfIntern * salaryIntern)
    val expensesSalaryaverage = expensesSalaryAll / (numberOfIntern + numberOfMaster)

    println(expensesSalaryMaster)
    println(expensesSalaryAll)
    println(expensesSalaryaverage)


}