package com.aonscreening.test.task2;

import static com.aonscreening.test.task2.SubArrayIndexSearch.findSubArrayIndex;
import static com.aonscreening.test.task2.SubArrayIndexSearch.findSubArrayIndexWithArraysMethod;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,9, 3, 7, 8};
        int[] subArray = {3, 7};
        int index = findSubArrayIndex(array, subArray);
        System.out.println("Sub-array starts at index: " + index);

        int indexWithArraysMethod = findSubArrayIndexWithArraysMethod(array,subArray);
        System.out.println("Sub-array starts at index: " + indexWithArraysMethod);

    }
}
