package com.company;
//      Integer массивден жуп сандарды терип алынызда
//      алардын квадраттарынын эн чонун табыныз.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {10, 11, 12, 13, 14};
        Arrays.stream(array).filter((x) -> x % 2 == 0).map((x) -> (int) Math.pow(x, 2)).max(Integer::compareTo).ifPresent(System.out::println);
    }
}
