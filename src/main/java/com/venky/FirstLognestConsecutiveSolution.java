package com.venky;

public class FirstLognestConsecutiveSolution {

        public static void main(String[] args) {
            //   Find the index and length of first longest consecutive character sequence ?
            String str = "aabbbbccddbbbbbb";
            char[] ch = str.toCharArray();
            int maxL = 0;
            int startIn = 0;
            int maxIndex = 0;
            int counter = 1;
            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] == ch[i + 1]) {
                    if (counter == 1) {
                        startIn = i;
                    }
                    counter++;
                } else {
                    if (maxL < counter) {
                        maxL = counter;
                        maxIndex = startIn;
                    }
                    counter = 1;

                }

                if (i == ch.length - 2) {
                    if (maxL < counter) {
                        maxL = counter;
                        maxIndex = startIn;
                    }
                    counter = 1;
                }
            }

            System.out.println(maxIndex + " <<>>>" + maxL);


        }


}