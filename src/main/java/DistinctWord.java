import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DistinctWord {


    public static void main(String[] args) {
        String sentence= " Hello!  hello,world ? !";
        char[] chars = sentence.toCharArray();
        Set<String> distictWord = new HashSet<String>();
        String word="";
        for (char c : chars)
        {
           // System.out.println( c+ "<>" + Character.isAlphabetic(c));
            if(Character.isAlphabetic(c))
            { word=word+""+c;
            }
            else
            {
               if (!word.trim().equals("")) {
               //    System.out.println(word.toLowerCase(Locale.ROOT));
                   distictWord.add(word.toLowerCase(Locale.ROOT));
               }
                word ="";
            }
        }

        System.out.println(distictWord);

    }


}
