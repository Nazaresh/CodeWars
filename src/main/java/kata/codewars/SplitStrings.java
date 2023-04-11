package kata.codewars;

import java.util.Arrays;

public class SplitStrings
{
    //Complete the solution so that it splits the string into pairs of two characters.
    //If the string contains an odd number of characters
    //then it should replace the missing second character of the final pair with an underscore ('_').

    public static void main(String[] args)
    {
        String[] w = solution("vav");
        System.out.println(Arrays.toString(w));
    }

    public static String[] solution(String s)
    {
        String[] q;

        if ((s.length()%2) == 0)
        {
            q = s.split("(?<=\\G.{2})");
        }
        else
        {
            s = s+"_";
            q = s.split("(?<=\\G.{2})");
        }
        return q;
    }
}
