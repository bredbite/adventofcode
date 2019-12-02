package se.bodenas.advent2019.day2

import kotlin.system.exitProcess

fun main() {
    val diskMemory = getMemoryFromDisk()

    for (noun in 0..99) {
        for (verb in 0..99) {
            val initializedMemory = initMemory(diskMemory, noun, verb)
            if (runCalculation(initializedMemory) == 19690720) {
                println("noun: $noun")
                println("verb: $verb")
                println("result: ${100 * noun + verb}")
                return
            }
        }
    }
}

private fun initMemory(memory: MutableList<Int>, noun: Int, verb: Int): MutableList<Int> {
    val memoryCopy = mutableListOf<Int>()
    memoryCopy.addAll(memory);
    memoryCopy[1] = noun
    memoryCopy[2] = verb
    return memoryCopy;
}

fun runCalculation(memory: MutableList<Int>): Int {
    var instructionPointer = 0
    var instruction = memory.get(instructionPointer);
    while (instruction != 99) {
        val parameter1 = memory.get(instructionPointer + 1)
        val parameter2 = memory.get(instructionPointer + 2)
        val parameter3 = memory.get(instructionPointer + 3)


        when (instruction) {
            1 -> memory[parameter3] = memory[parameter1] + memory[parameter2]
            2 -> memory[parameter3] = memory[parameter1] * memory[parameter2]
            else -> {
                throw IllegalStateException("operator $instruction is illegal")
            }
        }
        instructionPointer += 4
        instruction = memory.get(instructionPointer);
    }

    return memory.first()
}

private fun getMemoryFromDisk(): MutableList<Int> {
    val memory = readFilesAsString("res/2019/input2.txt")
            .split(",")
            .map { i -> i.toInt() }
            .toMutableList()
    return memory
}