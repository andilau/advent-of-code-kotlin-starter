package util

import java.io.File
import java.net.URI

object InputReader {
    fun getInputAsString(day: Int): String = File(fromResources(day)).readText()

    fun getInputAsList(day: Int): List<String> = File(fromResources(day)).readLines()

    fun getInputAsListOfInt(day: Int): List<Int> = File(fromResources(day)).readLines().map(String::toInt)

    fun getInputAsListOfLong(day: Int): List<Long> = File(fromResources(day)).readLines().map(String::toLong)

    private fun fromResources(day: Int): URI =
        javaClass.classLoader.getResource("input_day_$day.txt")?.toURI()
            ?: throw IllegalArgumentException("input file for day $day not found")
}
