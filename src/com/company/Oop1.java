package com.company;
import java.util.*;

public class Oop1 {
    public static void main(String[] args) {
        Student omkar = new Student();
        omkar.roll= 35;
        omkar.name = "omkar";
        omkar.marks = 99.3f;

//        System.out.println(omkar.roll);
//        System.out.println(omkar.name);
//        System.out.println(omkar.marks);
        omkar.greetings();


    }

}

// create a class
class Student{
    int roll;
    String name;
    float marks = 90;
    void greetings(){
        System.out.println("hello my nsme is " + this.name);
    }
    Student(){
        this.roll = 35;
        this.name = "omkar";
        this.marks = 99.5f;
    }
}