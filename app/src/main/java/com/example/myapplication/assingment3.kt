package com.example.myapplication
import java.util.Scanner
fun main(){

   val input = Scanner(System.`in`)
    var op = ""
    var num1 = 0.0
    var num2 = 0.0
    do {
        println("enter two numbers and an operator(+,-,*,/): ")
        num1 = input.nextDouble()
        num2 = input.nextDouble()
        op = input.next()

    }while (op != "+" && op != "-" && op != "*" && op != "/" )

    calc(num1,num2,op)

}


fun calc(num1: Double, num2: Double, op: String = "+"){
    var result = 0.0
    when (op) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2

    }

    println("the result is: $result")

}