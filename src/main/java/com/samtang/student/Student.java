package com.samtang.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int heighest() {
        /*// 方法一, 基本的 if else 處理
        int max = 0;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }
        return max;*/

        /*//方法二, 三次元運算式 (判斷式) ? A(true的執行結果) : B (false的執行結果)
        int max = (english > math) ? english : math;
        return max;*/

        //方法三, 直接回傳三次元運算式
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2);
    }
}
