package com.samtang;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().Hello();
        Person p = new Person("Tom",66.5f, 1.7f);
        p.Hello();

        System.out.println (p.bmi());

        int score = 88;
        System.out.println (score > 60);
        System.out.println (score > 60 && score < 90);
        System.out.println (score <60 || score >90);

        // char byte 變數因為都是 ASC整數碼, 所以可以做比較
        char c = 'A';
        System.out.println (c > 60);
        System.out.println (c > 'a');

        /*int age = 19;
        Integer age2 = 20;
        char c = 'I';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean aduit = true;
        boolean enroll = false;
        String name = "Samtang";*/
    }
}
