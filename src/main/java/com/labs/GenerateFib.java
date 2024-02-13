package com.labs;

import java.util.stream.Stream;

public class GenerateFib {
    public void generate(int num) {
        Stream.iterate(new int[]{0, 1}, a -> new int[] {a[1], a[0]+a[1]})
                .limit(num)
                .forEach(a -> System.out.println(a[0]));
    }

    public static void main(String[] args) {
        GenerateFib generateFib = new GenerateFib();
        generateFib.generate(10);
    }
}
