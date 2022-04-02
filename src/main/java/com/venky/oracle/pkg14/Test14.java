package com.venky.oracle.pkg14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test14 {
    public static void main(String[] args) throws IOException {
  char[] characters =  new char[100];

  try(FileReader reader = new FileReader("F:\\MyCourse\\repo\\algorithm\\src\\main\\java\\com\\venky\\oracle\\pkg14\\a.txt"))
  {

     // characters= reader.read();
    //  reader.readLine();
     // characters.read();
      reader.read(characters); // Option D is correct
      System.out.println(String.valueOf(characters));

  }
    }
}
/*
OPTION D  reaqer.read(characters);
 */