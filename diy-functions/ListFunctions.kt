

import findAverage// Write your code below
import checkIfListContains
fun getListOfNumbers(): MutableList<Int> {
  var myList = mutableListOf<Int>()

  for (i in 1..5) {
    println("Please add a number:")
    myList.add(Integer.valueOf(readLine()))
  }
  return myList
}

fun findMax(values: MutableList<Int>): Int {
    var largestNumber = values[0]
    for (i in values) {
        if (i > largestNumber) {
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(values: MutableList<Int>): Int {
    var smallestNumber = values[0]
    for (i in values) {
        if (i < smallestNumber) {
            smallestNumber = i
        }
    }
    return smallestNumber
}

fun findAverage(values: MutableList<Int>): Int {
    var sum = 0
    for (i in values) {
        sum += i
    }
    return sum / values.size
}

fun checkIfListContains(values: MutableList<Int>, nbr: Int): Boolean {
    for (i in values) {
        if (i == nbr) {
            return true
        }
    }
    return false
}


fun main() {
  // Write more code below
    var values = getListOfNumbers()
    println(values)
    var largestValue = findMax(values)
    println("The largest values is $largestValue")
    var smallestValue = findMin(values)
    println("The smallest number is $smallestValue")
    var average = findAverage(values)
    println("The average is $average")
    println("Enter a number to check if it is within the previous list.")
    var numToFind = Integer.valueOf(readLine())
    var containsValue = checkIfListContains(values, numToFind)
    if (containsValue) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}

