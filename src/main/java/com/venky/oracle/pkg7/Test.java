package com.venky.oracle.pkg7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "F:\\MyCourse\\repo\\algorithm\\src\\main\\java\\com\\venky\\oracle\\pkg7\\lines.txt";
        List< String > list = new ArrayList< >();
        try (Stream< String > stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .filter(line -> !line.equalsIgnoreCase("JAVA")).map(String::toUpperCase)
                    .collect(Collectors.toList());
        }
catch (IOException e)
            {

            }
        list.forEach(System.out :: println);
    }
}/**
 C
 C++
 GO
 KOTLIN
 */
