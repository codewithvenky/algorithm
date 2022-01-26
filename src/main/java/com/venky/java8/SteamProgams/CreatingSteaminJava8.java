package com.venky.java8.SteamProgams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingSteaminJava8 {

    public static void main(String[] args) {
            // Stream.of
//case 01 Stream.of
       // Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
    //    stream.forEach(i-> System.out.println(i)); lambda
      //  stream.forEach(System.out::println);
//case 02 Stream.of(array)

   /*     Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));

*/
   // case 03    List.stream()

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

       // Stream<Integer> stream= list.stream();
       // stream.forEach(p -> System.out.println(p));

        // case 04
        ///Stream.generate() or Stream.iterate()
 /*       Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);*/

  ///case 05      Stream of String chars or tokens
       /* IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));*/


   /*     Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));*/

        IntStream stream = IntStream.range(0, 25);
        stream.forEach(p -> System.out.println(p));

    }


}
