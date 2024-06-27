package com.example;

public class PairGen<T, V> {
    T first;
    V second;

    public PairGen(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}

class TestStatic {
    public static <T extends Number, V extends String> PairGen<T, V>
    createAndPrintPair(T first, V second) {
        System.out.println(first);
        System.out.println(second);
        return new PairGen<>(first, second);
    }
}

class PairGenDemo {
    public static void main(String[] args) {
        PairGen<Integer, String> test =
                TestStatic.createAndPrintPair(10, "test");
        System.out.println(test.getFirst());
        System.out.println(test.getSecond());
    }
}
