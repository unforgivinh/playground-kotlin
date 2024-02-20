package io.unforgivinh.playground.kotlin.delegation

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DelegationWithKotlinTest {

    @Test
    fun testDelegate() {

        val delegate = BehaviorDelegate(10)

        val derived = Derived(delegate)

        val res = derived.print()

        Assertions.assertEquals("BehaviorDelegate: x = 10", res)
    }

}
