package ru.netology
import kotlin.math.roundToInt

fun main() {
    val purchase = 15000
    val regularBuyer = true
    var result: Double
    var discount: Double

    if (purchase in 0..1000) {
        result = purchase.toDouble()
    } else if (purchase in 1001..10000) {
        result = (purchase - 100).toDouble()
    } else if (purchase > 10000) {
        discount = purchase * 0.05
        result = purchase - discount
    } else {
        result = purchase.toDouble()
    }

    if (regularBuyer) {
        val additionalDiscount = result * 0.01
        result -= additionalDiscount
    }

    result = result.roundToInt().toDouble()

    println("Итого к оплате: $result")
}