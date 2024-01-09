package com.company;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        // syntax : ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList <Integer> list = new ArrayList<>(5);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(139);
        list.add(125);
        list.add(132);
        list.add(123);
        list.add(114);
        list.add(139);
        list.add(125);
        list.add(132);
        System.out.println(list);
        System.out.println(list.contains(1243));
        list.set(0,100);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
