package com.venky.oracle.pkg9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("F:\\MyCourse\\repo\\algorithm\\src\\main\\java\\com\\venky\\oracle\\pkg9");
            // line 1

            //Option A
            //    BasicFileAttributes attributes = Files.getAttribute(path, "isDirectory");
            // Option     B
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            // Option     C
            //   BasicFileAttributes attributes = Files.readAttributes(path);

            //Option  D
            //    BasicFileAttributes attributes = Files.readAttributes(path, FileAttributes.class);
            System.out.println(attributes.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}