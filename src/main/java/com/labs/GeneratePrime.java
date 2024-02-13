package com.labs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePrime {
    public List<Integer> generate(int num) {
        return IntStream.rangeClosed(2, num-1).boxed()
                //.peek(integer -> System.out.println("generate ==> " + integer))
                .filter(i -> isPrime(i))
                .collect(Collectors.toList());
    }

    public boolean isPrime(int num) {
        return IntStream.rangeClosed(2, num-1).boxed()
                //.peek(integer -> System.out.println("num/i = " + num%integer))
                .noneMatch(i -> num%i == 0);
    }

    public static void main(String[] args) {
        GeneratePrime generatePrime = new GeneratePrime();
        List<Integer> primeList = generatePrime.generate(1000);
        primeList.stream().forEach(i -> System.out.println(i));
    }
}
