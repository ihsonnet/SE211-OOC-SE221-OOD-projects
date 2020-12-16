package com.excercise;

public class Student extends Person {
    public Student(int age) {
        super.SetAge(age);
    }

    public void Greet(String greetings){
        System.out.println(greetings+" everyone.");
    }

    public void ShowAge(){
        System.out.println("My Age is :"+super.getAge()+" years old");
    }
}
