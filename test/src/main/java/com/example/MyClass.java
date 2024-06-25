package com.example;

import java.util.List;

public class MyClass<T> {
    List<T> tList;

    public MyClass(List<T> tList) {
        this.tList = tList;
    }

    void printList(boolean isIven) {
        int j = 0;
        if (isIven) {
            j = 1;
        }
        for (int i = j; i<tList.size(); i+=2) {
            System.out.print(tList.get(i) + ", ");
        }
    }
}

class MyMainClass {
    public static void main(String[] args) {
        MyClass<String> stringMyClass = new MyClass<>(List.of("1", "2", "3", "4", "5"));
        stringMyClass.printList(true);
        System.out.println();
        stringMyClass.printList(false);
    }
}
