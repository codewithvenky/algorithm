package com.venky.oracle.pkg14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test14 {
    public static void main(String[] args) throws IOException {
  char[] characters =  new char[100];

  try(FileReader reader = new FileReader("c:\\test\\a.txt")){
  {
  //  characters= reader.read();
     // reader.readLine();
      //characters.read();
      //reader.read(characters);
      System.out.println(String.valueOf(characters));
  }
  }
    }
}
