package com.excercise;

public class StudentAndAdminTest {
    public static void main(String[] args) {
//a
        Person p = new Person();
        p.Hello();
//b
        Student s = new Student(20);
        s.Greet("Good Morning");
        s.ShowAge();
//c
        Admin a = new Admin(30);
        a.Hello();
        a.Explain();
    }
}
