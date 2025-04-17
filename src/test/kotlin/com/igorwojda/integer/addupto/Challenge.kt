package com.igorwojda.integer.addupto

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

// O(1)
private fun addUpTo(n: Int): Int {
    return addUptoUsingFormula(n)
//    return addUptoUsingOperator(n)
//    return addUptoUsingForEach(n)
    return addUptoUsingFoldOperator(n)
}

private fun addUptoUsingFormula(n: Int): Int {
    var sum = ((n + 1) * n) / 2
    return sum
}

private fun addUptoUsingOperator(n: Int): Int {
    return (0..n).sum()
}

// O(n)
private fun addUptoUsingForEach(n: Int): Int {
    var sum = 0
    (0..n).forEach {
        sum += it
    }
    return sum
}

// using fold operator
private fun addUptoUsingFoldOperator(n: Int): Int {
    return (0..n).fold(0) { accumulated, i -> accumulated + i }
}


private class Test {
    @Test
    fun `add up to 1`() {
        addUpTo(1) shouldBeEqualTo 1
    }

    @Test
    fun `add up to 3`() {
        addUpTo(3) shouldBeEqualTo 6
    }

    @Test
    fun `add up to 10`() {
        addUpTo(10) shouldBeEqualTo 55
    }

    @Test
    fun `trial`() {
        addUptoUsingOperator(2)
    }
}
