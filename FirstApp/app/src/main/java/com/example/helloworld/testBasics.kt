package com.example.helloworld

import android.content.Context

fun main() { println("\n ");start();println("\n ")}

fun start(){

    //var meron = Person("meron", 26)
    var testuser = User(12, "akon")
    var updateduser = testuser.copy(11)
    println(testuser)
    println(testuser.component1())
    println(testuser.component2())

}



// Data classes
data class User(val id : Int, var name: String){

}










// Normal Classes
class Person// Secondary constructor
    (name: String, age: Int) {
    var age: Int
    var name : String

    // Primary constructor - This works if we pass arguments to the class itself when declaration
    init {
         this.age = age
         this.name = name
         println("A Person created : $name , $age")
    }
}

