package com.samtang.student;

public class StudentRunner {
    public static void main(String[] args) {
        /*//原先的基本寫法
        student stu = new student();
        stu.name = "Sam";
        stu.english = 60;
        stu.math = 77;*/

        Student stu = new Student("Hank", 60, 77);

        stu.print();
    }
}
