package br.com.marcosaleixo.helloworld

fun main(){
    var a = "Initial"
    println(a)
    a = "Final"
    println(a)
    val b = 0
    println(b)
    val c = 3
    println(c)

    fun someCondition() = false
    val d: Int
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}