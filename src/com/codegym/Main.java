package com.codegym;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.addFirst("eight");
        list.remove(5);
//        list.clear();

        printMyList(list);
    }

    private static void printMyList(MyList<String> list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
