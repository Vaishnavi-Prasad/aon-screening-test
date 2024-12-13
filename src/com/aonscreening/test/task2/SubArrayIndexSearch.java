package com.aonscreening.test.task2;

import java.util.Arrays;

public class SubArrayIndexSearch {

    /* Came up with two approaches,
    the first approach is by using 2 for loops  where the outer loop represents the main array and the nested loop represents the subarray and
    by comparing the arrays elements  we can identify the index*/

    /* first is a brute force approach O(n^2) and the second one is an optimized one O(n) */
        public static int findSubArrayIndex(int[] array, int[] subArray) {
            for (int i = 0; i <= array.length - subArray.length; i++) {
                boolean isSubArray = true;
                for (int j = 0; j < subArray.length; j++) {
                    /* the below line is to compare the main array with subarray ,
                    only if the main array element matches the first element we should increment the nested loop for comparing the rest of the elements of subarray */
                    if (array[i + j] != subArray[j]) {
                        isSubArray = false;
                        break;
                    }
                }
                if (isSubArray) {
                    return i;
                }
            }
            return -1;
        }


        /* the second approach is by using Array's inbuilt methods for comparing the
        arrays for equality by using equals method and copy of range to create a window array*/
    public static int findSubArrayIndexWithArraysMethod(int[] array, int[] subArray) {
        int subArrayLength = subArray.length;
        for (int i = 0; i <= array.length - subArrayLength; i++) {
            if (Arrays.equals(Arrays.copyOfRange(array, i, i + subArrayLength), subArray)) {
                return i;
            }
        }
        return -1;
    }
    }

