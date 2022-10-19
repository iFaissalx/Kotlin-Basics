package com.example.myapplication
import java.util.Scanner

fun main(){

    val arr = doubleArrayOf(0.0,0.0,0.0,0.0,0.0)
    val input = Scanner(System.`in`)

    println("enter 5 numbers to get their average: ")

    for (i in 0..4){
        arr[i] = input.nextDouble()
    }

    var avg = 0.0
    var sum = 0.0

    for (i in 0..arr.size-1){

        sum += arr[i]

    }
    avg = sum/arr.size

    println(avg)
}