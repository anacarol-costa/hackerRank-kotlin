package algorithms.warmUp

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var n = arr.size
    var diagonalEsquerda = 0
    var diagonalDireita = 0

    for (i in arr.indices ) {

        for (j in arr.indices) {

            if (i == j) {
                diagonalEsquerda += arr[i][j]
            }

            if (i + j == n -1) {
                diagonalDireita += arr[i][j]
            }
        }

    }
    return Math.abs(diagonalEsquerda - diagonalDireita)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
