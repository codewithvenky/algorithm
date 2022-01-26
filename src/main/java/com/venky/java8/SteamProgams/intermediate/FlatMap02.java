package com.venky.java8.SteamProgams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap02 {
    public static void main(String[] args)
    {
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        List<String> listOfAllChars = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println(listOfAllChars);
    }


}
