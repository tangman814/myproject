package com.samtang;

public class Person {

    String name;
    float weight;
    float height;

    //以下為不寫任何程式預設的建構值
  /*  public Person(){
        super();
    }*/

    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height){
        this(weight,height); //呼叫上一個建構子避免程式重覆的問題, 但一定要放到第一行
        this.name = name;
        /*this.weight = weight; //利用呼叫前一個建構子就可以省到重覆的程式問題
       this.height = height;*/
    }


    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void Hello() {
        System.out.println("Hello World use Person");
    }
}
