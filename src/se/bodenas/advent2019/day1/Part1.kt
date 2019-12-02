package se.bodenas.advent2019.day1

import java.io.File

fun main(args: Array<String>) {
    val moduleMassList = readFilesAsLines("res/2019/input1.txt");
    val totalFuelNeeded = moduleMassList.map { mass -> fuelFromMass(mass.toDouble()) }.sum();
    println(totalFuelNeeded)

}

fun fuelFromMass(mass: Double) = Math.floor(mass / 3) - 2

fun readFilesAsLines(fileName: String): List<String> = File(fileName).readLines()