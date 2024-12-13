package com.aonscreening.test.task1;

/* The deign approach used is inheritance as the use case here is simple,
code can be reused and enhancements for the timing functionalities can be done without modifying MyIncDec class*/
public class MethodTimerIncDec extends MyIncDec  {
    public MethodTimerIncDec(int x) {
        super(x);
    }

    @Override
    public void increment() {
        // here currentTimeMillis is used to get current time in milliseconds. If more precision is needed we cn use nanoTime as well.
        long methodStartTime = System.currentTimeMillis();
        super.increment();
        long methodEndTime = System.currentTimeMillis();
        System.out.println("Total time elapsed for increment() method " + (methodEndTime - methodStartTime) + " ms. Current value: " + getValue());
    }

    @Override
    public void decrement() {
        long methodStartTime = System.currentTimeMillis();
        super.decrement();
        long methodEndTime = System.currentTimeMillis();
        System.out.println("Total time elapsed for decrement() method " + (methodEndTime - methodStartTime) + " ms. Current value: " + getValue());
    }
}
