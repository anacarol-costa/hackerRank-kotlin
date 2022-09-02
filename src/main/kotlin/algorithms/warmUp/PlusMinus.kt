package algorithms.warmUp

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */


fun plusMinus(arr: Array<Int>): Unit {
    var positivos: Int = 0
    var negativos: Int = 0
    var zero: Int = 0

    for (i in arr) {
               if (i > 0) {
                   positivos ++
               }

               else if (i < 0) {
                   negativos ++
               }

               else {
                   zero ++
               }
       }

    println(positivos.toDouble()/arr.size)
    println(negativos.toDouble()/arr.size)
    println(zero.toDouble()/arr.size)
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
