package com.labs;

public class Factorial {

    public int factorial(int num, int result) {
        if (num == 0) {
            return 1;
        }
        result = num * result;
        return num * factorial(num-1, result);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5, 1));
    }

}
