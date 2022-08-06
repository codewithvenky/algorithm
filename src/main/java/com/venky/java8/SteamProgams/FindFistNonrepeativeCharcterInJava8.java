package com.venky.java8.SteamProgams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFistNonrepeativeCharcterInJava8 {
    public static void main(String[] args) {
        String str ="aldkjfklanf";
        str.chars()      //string stream
        .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
        .entrySet().stream().filter(e->e.getValue()==1).limit(1).forEach(System.out :: println);
      ;
     //   System.out.println(first);
    }
}
