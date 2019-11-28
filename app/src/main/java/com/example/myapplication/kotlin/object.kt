package com.example.myapplication.kotlin

interface mouseListener {
    fun mouseClicked()
    fun mouseEntered()
}

fun main(args: Array<String>) {
    var window = Window()
    window.addMouseListener(object :mouseListener{
        override fun mouseClicked() {
            print("hello world")
        }

        override fun mouseEntered() {

        }
    })

}

class Window {
    fun addMouseListener(listener: mouseListener) {
        listener.mouseClicked()
    }
}