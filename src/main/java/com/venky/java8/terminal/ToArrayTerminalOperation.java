package com.venky.java8.terminal;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Returns an array containing the elements of this stream, using the provided generator function
to allocate the returned array, as well as any additional arrays that might be required for a partitioned execution or for resizing.

This will convert a stream into Object[] array or into a specified array to the IntFunction.
 */
public class ToArrayTerminalOperation {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Object[] objArray = stream.toArray();
        System.out.println(Arrays.toString(objArray));
        System.out.println("objArray length " + objArray.length);
    }
}
