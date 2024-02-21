package com.labs;

import java.util.Arrays;

/**
 * Input Window - 1 3 -1 -3 5 3 6 7
 * Window Size - 3
 * Find the max
 *
 */

public class MaxInSlidingWindow {
   int getMaxSum(int[] array, int windowSize) {
       int[] windowArray = new int[windowSize];
       System.arraycopy(array, 0, windowArray, 0, windowSize);
       int maxWindowValue = Arrays.stream(windowArray).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
       int startInd = 1;
       int endInd = windowSize;
       while (endInd < array.length) {
           int start = array[startInd];
           int end = array[endInd];
           if (maxWindowValue >= start && maxWindowValue >= end) {
               // do not do anything as maxWindowValue continues to be the max value.
           } else if (maxWindowValue == start) {
               windowArray[0] = array[endInd];
               maxWindowValue = Arrays.stream(windowArray).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
           } else if (end > maxWindowValue) {
               maxWindowValue = end;
           }
           startInd++;
           endInd++;
       }
       return maxWindowValue;

   }

    public static void main(String[] args) {
        MaxInSlidingWindow maxSumInSlidingWindow = new MaxInSlidingWindow();
        int[] inputArray = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int maxWindowValue = maxSumInSlidingWindow.getMaxSum(inputArray, 3);
        System.out.println(maxWindowValue);
    }
}
