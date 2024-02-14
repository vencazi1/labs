package com.labs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Generate Pythogaras numbers till num
 * ie a^2 + b^2 = c^2
 * ex 3*3 + 4*4 = 5*5
 */

public class GeneratePythagoras {

    public void generate(int num) {
        List<double[]> list = IntStream.rangeClosed(1, num).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, num).boxed()
                        .map(b -> new double[] {a, b, Math.sqrt(a*a + b*b)}))
                .filter(arr -> arr[2] % 1.0 == 0)
                .collect(Collectors.toList());
        list.stream().forEach(a -> System.out.println((int) a[0] + ", " + (int) a[1] + ", " + (int) a[2]));
    }

    public static void main(String[] args) {
        GeneratePythagoras generatePythagoras = new GeneratePythagoras();
        generatePythagoras.generate(100);
    }
}
