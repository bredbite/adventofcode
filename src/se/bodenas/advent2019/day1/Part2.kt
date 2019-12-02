package se.bodenas.advent2019.day1


fun main() {
    val moduleMassList = readFilesAsLines("res/2019/input1.txt");
    val totalFuelNeeded = moduleMassList.map { mass -> fuelFromMassRecursion(mass.toDouble()) }.sum();
    println(totalFuelNeeded)

}

fun fuelFromMassRecursion(mass: Double): Double {
    val fuel = fuelFromMass(mass)
    return if (fuel > 0) fuel + fuelFromMassRecursion(fuel) else 0.0;
}

