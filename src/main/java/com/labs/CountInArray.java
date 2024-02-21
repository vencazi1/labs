package com.labs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class CountInArray {

    private void count() {
        Map<Integer, Long> test = Arrays.stream(new int[] {1,2,3,4,2,3,4,7,8,3,2}).boxed().collect(groupingBy(i->i, counting()));
        System.out.println(test);
        Stream<String> test1 = Arrays.stream(new String[]{"a", "b", "a", "b", "a", "c", "a", "b"});
        System.out.println(test1.collect(groupingBy(j->j, counting())));
    }

    public static void main(String[] args) {
        CountInArray countInArray = new CountInArray();
        countInArray.count();
    }

}
