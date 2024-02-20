package io.unforgivinh.playground.kotlin.delegation

interface Behavior {

    val message: String

    fun print(): String
}

class BehaviorDelegate(x: Int) : Behavior {

    override val message = "BehaviorDelegate: x = $x"

    override fun print(): String {
        println(message)
        return message
    }
}

class Derived(b: Behavior) : Behavior by b {
    // This property is not accessed from b's implementation of `print`
    override val message = "Message of Derived"
}

fun main() {
    val b = BehaviorDelegate(10)
    val derived = Derived(b)
    derived.print()
    println(derived.message)
}
