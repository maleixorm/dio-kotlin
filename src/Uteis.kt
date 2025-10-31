package br.com.marcosaleixo.helloworld

fun main() {

    val numbers = listOf(1, 2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")

    val anyNegative = numbers.any { it < 0}
    val anyGT6 = numbers.any { it > 6 }

    println(anyNegative)
    println(anyGT6)

    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}
