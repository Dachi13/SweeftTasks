package com.Job;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Sweeft {

    // Task 1
    public int singleNumber(int[] arr) {
        AtomicInteger result = new AtomicInteger();
        Arrays.stream(arr).forEach(n -> result.updateAndGet(v -> v ^ n));
        return result.get();
    }
    // Task 2
    static int minSplit(int amount) {
        int count = 0;

        while (amount >= 50) {
            amount -= 50;
            count++;
        }
        while (amount >= 20) {
            amount -= 20;
            count++;
        }
        while (amount >= 10) {
            amount -= 20;
            count++;
        }
        while (amount >= 5) {
            amount -= 5;
            count++;
        }

        while (amount >= 1) {
            amount -= 1;
            count++;
        }
        return count;
    }

    // Task 3
    public int notContains(int[] array) {
        if(array.length == 0)
            throw new IllegalArgumentException("The array is empty");
        else if(array.length == 1)
            return array[0];

        int temp = array[0];
        for (int i = 1; i < array.length; i++)
            if(temp < array[i])
                temp = array[i];
        return ++temp;
    }

    // Task 4
    public String addBinaryStrings(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }

    // Task 5
    public int floor(int n) {
        if (n < 0)
            return 0;
        else if (n <= 1)
            return 1;
        else
            return floor(n-1) + floor(n-2);
    }

}
