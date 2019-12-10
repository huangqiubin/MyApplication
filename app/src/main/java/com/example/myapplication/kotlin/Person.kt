package com.example.myapplication.kotlin

open class Animal(var age: Int, var name: String)

class Bird<T:Animal>(var eat:String){

}