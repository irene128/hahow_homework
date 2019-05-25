package com.box

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter object's length:")
    try {
        var len = scanner.nextFloat()
        println("Please enter object's width:")
        var wid = scanner.nextFloat()
        println("Please enter object's height:")
        var hei = scanner.nextInt()

        var foundFitBox = false
        var box3KT = Box3KT(23f, 14f, 13)
        if (box3KT.validate(len, wid, hei)) {
            println("Box3")
            foundFitBox = true
        } else {
            var box5KT = Box5KT(39.5f, 27.5f, 23)
            if (box5KT.validate(len, wid, hei)) {
                print("Box5")
                foundFitBox = true
            }
        }

        if (!foundFitBox)
            println("No suitable box.")
    }catch (e:Exception){
        print("Error!")
        e.printStackTrace()
    }

}