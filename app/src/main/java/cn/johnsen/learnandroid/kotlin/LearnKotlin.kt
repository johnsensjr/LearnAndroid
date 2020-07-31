package cn.johnsen.learnandroid.kotlin

import cn.johnsen.learnandroid.kotlin.classinfo.*
import kotlin.math.max

/**
 * 简 述:
 * 作 者:
 * 时 间: 2020/7/29
 */

fun main() {
//    val a = 10//val不可变
//    var b = "10"//var可变
//    val c = 7
//    println(b + a)
//    println(largerNumber(a, c))
//
//    for (i in 0 until 10 step 3) {
//        println(i)
//    }
//    for (i in 10 downTo 1 step 2) {
//        println(i)
//    }

//    val person = Person()
//    person.age = 15
//    person.name = "小明"
//    person.play()

//    val student = Student("01",3,"小花",16)
//    val student1 = Student("小明",3)
//    val student2 = Student()
//    student.age = 18
//    student.name = "小红"
//    student1.play()
//    student2.play()
//    student.play()
//    doStudy(student)//多态
//    student1.doHomework()
//    student1.readBooks()
//    student2.doHomework()
//    student2.readBooks()

//    val cellPhone = CellPhone("小米",2800.00)
//    println(cellPhone)

    Singleton.singletonPrint()

}

fun doStudy(study: Study){
    study.doHomework()
    study.readBooks()
}


fun largerNumber(a: Int, b: Int) = max(a, b)
fun largerNumber1(a: Int, b: Int) = if (a > b) a else b
fun getScore(name: String) = when {
    name.startsWith("Tom") -> 89
    name == "J" -> 60
    else -> 0
}

fun getScore1(name: String) = when (name) {
    "Tom" -> 89
    "J" -> 60
    else -> 0
}