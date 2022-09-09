package com.venky.company.coderByte;
/*
ArrayChallenge(strArr) read the array of strings stored in strArr,
which will contain 2 elements: the first element will be a sequence of characters representing a word,
 and the second element will be a long string of comma-separated words, in alphabetical order, that represents
 a dictionary of some arbitrary length.
  For example: strArr can be: ["worlcde", "apple,bat,cat,goodbye,hello,yellow,why,world"].
   Your goal is to determine the minimum number of characters,
    if any, can be removed from the word so that it matches one of the words from the dictionary. In this case, your program should return 2 because once you remove the characters "c" and "e" you are left with "world" and that exists within the dictionary. If the word cannot be found no matter what characters are removed, return -1.
Examples
Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output: 4
Input: new String[] {"apbpleeeef", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output: 8
 */
public class DetermineMinimumNumberOfCharactersCanRemovedFromWord {
    public static String ArrayChallenge(String[] strArr) {
        String word = strArr[0];
        char [] wordArr =word.toCharArray();
        String [] dictionryWord = strArr[1].split(",");
        int  MIN = Integer.MAX_VALUE;
        for (int i  =0; i < dictionryWord.length; i++)
        {
            String diWord = dictionryWord[i];
            //System.out.println( word +"<<<>>>"+diWord);
            char []diWordArr = diWord.toCharArray();
            int  minReplace =0;
            String tempString ="";
 int j =0;
 int l =0;
 while (j < wordArr.length || l< diWordArr.length)
 {
     if ( l< diWordArr.length  &&  j < wordArr.length  && wordArr[j] == diWordArr[l])

     {
         tempString= tempString+ diWordArr[l];
         j++;
         l++;
     }
     else if (  l< diWordArr.length &&  j < wordArr.length  && wordArr[j] != diWordArr[l])
     {
         minReplace++;
         j++;
     }
     else if ( l>= diWordArr.length &&  j < wordArr.length  )
     {
         minReplace++;
         j++;
     }
     else if(j>= wordArr.length)
     {
         break;
     }


 }

//System.out.println(minReplace);
//System.out.println(tempString);


            if(MIN >  minReplace )
            {MIN=minReplace;
            }
        }
        // code goes here
        return MIN +"";
    }

    public static void main (String[] args) {
        String [] input01= {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        String [] input02= {"apbpleeeef", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};

        System.out.println(ArrayChallenge(input01));

        System.out.println(ArrayChallenge(input02));

    }

}
