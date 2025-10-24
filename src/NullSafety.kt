package br.com.marcosaleixo.helloworld

import org.jetbrains.annotations.NotNull

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null strng"
        }
    }

    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}