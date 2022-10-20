package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(2, 8, 12, 10));
        List<Integer> number1 = new ArrayList<>(List.of(3, 5, 8, 20));
        List<List<Integer>> listOfLists = new ArrayList<>(List.of(number, number1));
        List<Integer> IntsList = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("Flat numbers" + IntsList);
        System.out.println("Sorted numbers" + IntsList.stream().sorted().collect(Collectors.toList()));
        IntsList.add(null);
        List<Integer> withoutNull = IntsList.stream().map(el -> Optional.ofNullable(el).orElse(55)).collect(Collectors.toList());
        System.out.println("Null is being changed to 55" + withoutNull);
        FunctionalInterface n = (Integer x) -> x * 2;
        List<Integer> task3 = withoutNull.stream().map(n::method1).collect(Collectors.toList());
        System.out.println(task3);
    }


}