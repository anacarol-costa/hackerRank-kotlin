package algorithms.warmUp

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var alicePontos = 0
    var bobPontos = 0

    for (i in 0 until a.size) {
        val arNumAlice = a[i]
        val arNumBob = b[i]

        if (arNumAlice > arNumBob) {
            alicePontos++
        } else if (arNumAlice < arNumBob) {
            bobPontos++
        }
    }
     return arrayOf(alicePontos, bobPontos)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
