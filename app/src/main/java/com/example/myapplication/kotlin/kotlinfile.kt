package com.example.myapplication.kotlin

fun main(args: Array<String>) {
//    var func = { number:Int -> number * 4 }
//    processTheAnswer(func)
//    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"), Person("Sverlana", "Isakova", null))
//    val contactListFilters = ContactListFilters()
//    with(contactListFilters){
//        prefix = "Dm"
//        onlyWithPhoneNumber = true
//    }
//    println(contacts.filter(contactListFilters.getPredicate()))
    var point = Point(2,4)
    var(x,y) = point
    print(x+y)
}

//使用函数参数
public fun processTheAnswer(f: (Int) -> Int) {
    println(f(3))

}

//声明数据类
data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)

//过滤联系人
class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix
        }
        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}

class Point(val x:Int,val y:Int){
    operator fun component1() = x
    operator fun component2() = y
}



