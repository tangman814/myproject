package com.samtang.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        /*//原先的基本寫法
        student stu = new student();
        stu.name = "Sam";
        stu.english = 60;
        stu.math = 77;*/

//        userInput();
        Student stu = new Student("Samtang", 77, 90);

        stu.print();
        System.out.println("Hight score : " + stu.heighest());

    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input student's name : ");
        String name = scanner.next();
        System.out.println("Please input student's english : ");
        int english = scanner.nextInt();
        System.out.println("Please input student's math : ");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);

        stu.print();
        System.out.println("Hight score : " + stu.heighest());
    }
}
