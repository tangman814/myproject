package com.samtang

fun main() {
//    println("Hello Kotlin")
//    Human().Hello()
    val h = Human()
    h.Hello()

    val age = 19 //val 宣告變數後無法更換變數值
    //age = 20  //指定為 val 重新塞值會錯誤

    var age2 : Int = 19 //val 宣告變數 : 後方可以指定型態
    age2 = 20   //可以重新塞值

    var weight = 22.6   //無需宣告型態 預設會 double 型態
    var height = 2.4f   //指定變數型能為 float

    var name : String   //若非一開始塞值給變數, 則必須需告變數型態
    name = "Samtang"

}

class Human() {
    fun Hello() {
        println("Hello Kotlin use Human")
    }
}