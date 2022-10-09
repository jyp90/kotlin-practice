package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

// try catch finally
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("$e is not number")
    }
}

fun parseIntOrThrowV02(str: String): Int? {
    return try { // using expression
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// unchecked exception
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// try with resources
fun readFileWithPath(path: String) {
    BufferedReader(FileReader(path)).use {reader ->

    }
}