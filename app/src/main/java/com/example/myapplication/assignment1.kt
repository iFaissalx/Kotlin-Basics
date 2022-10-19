package com.example.myapplication

fun main(){

    for (i in 1 .. 100){

        if (i == 71) println("ITS OVER 70!!!")
        println(i)
    }

println("/////////////////////////////")

    var temp = 35

    while (temp>=10){
        println(temp)

        when(temp){
            30 -> println("ITS HOT")
            20 -> println("ITS COMFY")
            15 -> println("ITS COLD!!")
        }
        temp--
    }
}