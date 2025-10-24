package br.com.marcosaleixo.helloworld

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 1.618, 2.7, 3.14)
    println(stack)
}