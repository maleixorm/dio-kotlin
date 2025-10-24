package br.com.marcosaleixo.helloworld

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "teste@teste.com")
    println(contact.id)
    println(contact.email)
    contact.email = "john@skynet.com"
    println(contact.email)
}