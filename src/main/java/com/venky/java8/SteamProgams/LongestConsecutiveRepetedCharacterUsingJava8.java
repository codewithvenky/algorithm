package com.venky.java8.SteamProgams;

import java.util.HashMap;
import java.util.Map;

class Meta
{
     static  int total=0;
     static char aChar;
      static  int temp=1;

}
public class LongestConsecutiveRepetedCharacterUsingJava8 {
    public static void main(String[] args) {
        String str ="aaabcaaabbbbbdtssssbb";
        int []count={0};
        Map<Integer,String> map = new HashMap<>();
        str.chars().mapToObj(e->(char)e).reduce((c1, c2) ->
        {
            if(c1==c2)
            {Meta.temp++;
            }
            else
            {
                if(Meta.temp>Meta.total) {
                    Meta.total = Meta.temp;
                    Meta.aChar = c1;
                }
                Meta.temp=1;
            }
    return c2;});
        System.out.println(Meta.aChar +"~" +Meta.total);
    }
}
