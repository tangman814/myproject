package com.samtang.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("Jack", 99, 80)
    stu.print()
//    println("Hight score : " + stu.heighest()) // 原本的寫法可以用
    println("Hight score : ${stu.heighest()}") // 利用 $ 直接組合成字串
    val test = "12345"
    println("test is $test") // 利用 $ 直接組合成字串
}

class Student (var name : String?, var english : Int, var math : Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2)
    }

    fun nameCheck() {
        println(name?.length)  //因為有可能為 Null , 要加上問號
    }

    fun heighest() : Int {
        /*// 方法一, 一般 if else
        var max = 0
        if (english > math) {
            max = english
        } else {
            max = math
        }
        return max*/

        /*// 方法二, if 可以寫在等號的右邊
        var max = if (english>math) english else math
        return max*/

        // 方法二之一, 在等號的右邊可以寫完整的 if else, 只要最後一行放上要回傳的值
        var max = if (english>math) {
            println("Is Englisk : ")
            english  // 最後一行放上回傳值
        } else {
            println("Is Math : ")
            math // 最後一行放上回傳值
        }
        return max

        /*// 方法三, 直接做回傳
        return if (english>math) {
            println("Is Englisk : ")
            english  // 最後一行放上回傳值
        } else {
            println("Is Math : ")
            math // 最後一行放上回傳值
        }
        return max*/
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`) //`in` 因為Kotlin in 是關鍵字, 使用時需要重音符號
    print("Please inpute student's name : ")
    //var name = scanner.next()
    var name = null //將 Null 代入
    print("Please inpute student's english : ")
    var english = scanner.nextInt()
    print("Please inpute student's math : ")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

