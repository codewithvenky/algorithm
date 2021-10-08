package com.venky.problem.houseticket;

import java.util.Random;
import java.util.stream.IntStream;

public class MainTest01 {
    public static void main(String[] args) {
        IntStream.range(0,9).forEach(value -> {
            System.out.println(getRandomNumberForCol(value));
        });
    }

    private static int getRandomNumberForCol(int high) {
        if (high == 0) {
            high = 10;
        }
        else
        { high = (high + 1) * 10;

        }
        int low = high - 9;
        Random r = new Random();
        return r.nextInt(high - low) + low;
    }
}
