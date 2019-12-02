package se.bodenas.advent2019.day2

import java.io.File

fun main() {
    val memory = readFilesAsString("res/2019/input2.txt")
            .split(",")
            .map { i -> i.toInt() }
            .toMutableList()
    memory[1] = 12
    memory[2] = 2

    var instructionPointer = 0
    var instruction = memory.get(instructionPointer);
    println("Operator: $instruction")
    while (instruction != 99) {
        val parameter1 = memory.get(instructionPointer + 1)
        val parameter2 = memory.get(instructionPointer + 2)
        val parameter3 = memory.get(instructionPointer + 3)


        println("value1: $parameter1")
        println("value2: $parameter2")
        println("storeAddress: $parameter3")
        println("===========")

        when (instruction) {
            1 -> memory[parameter3] = memory[parameter1] + memory[parameter2]
            2 -> memory[parameter3] = memory[parameter1] * memory[parameter2]
            else -> {
                throw IllegalStateException("operator $instruction is illegal")
            }
        }
        instructionPointer += 4
        instruction = memory.get(instructionPointer);
        println("Operator: $instruction")
    }

    println("Result: ${memory.first()}");
}

fun readFilesAsString(fileName: String): String = File(fileName).readText()
