package com.aonscreening.test.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Method Execution Time With Value");
        IncDec incDec = new MethodTimerIncDec(10);
        incDec.increment();
        incDec.decrement();

    }
}