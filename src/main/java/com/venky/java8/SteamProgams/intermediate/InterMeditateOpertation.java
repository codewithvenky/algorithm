package com.venky.java8.SteamProgams.intermediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterMeditateOpertation {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("venky");

        /*Stream.filter()
        The filter() method accepts a Predicate to filter all elements of the stream.
        */
      //  memberNames.stream().filter(s -> s.startsWith("S")).forEach(System.out:: println);

      /*  Stream.map()
        The map() intermediate operation converts each element
        in the stream into another object via the given function.*/

       //  memberNames.stream().map(String::toUpperCase).forEach(System.out::println);
        /*Stream.sorted()
        The sorted() method is an intermediate operation that
         returns a sorted view of the stream.
        */


     //   memberNames.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out:: println);


  /*      memberNames.stream().sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .forEach(System.out::println);*/


/*

        distinct()
        Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
*/

     // memberNames.stream().distinct().forEach(System.out:: println);
/*

        peek()
        Returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.
*/

     //memberNames.stream().peek(e -> System.out.println("Filtered value: " + e)).distinct().forEach(System.out:: println);
       /* Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
*/

         /*  skip()
        This method skips the given n elements and returns a Stream.
        This is the most useful when want to perform any operations on last
        n records or lines from a List or Stream.
        */


        Stream.of("one", "two", "three", "four", "five").skip(2).forEach(item -> System.out.println(item));


    }
}
