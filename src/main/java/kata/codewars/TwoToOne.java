package kata.codewars;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOne
{
    //Take 2 strings s1 and s2 including only letters from a to z.
    //Return a new sorted string, the longest possible, containing
    //distinct letters - each taken only once - coming from s1 or s2.

    public static void main(String[] args)
    {
        longest("aretheyhere", "yestheyarehere");
    }

    //first solution
    public static String longest (String s1, String s2)
    {
        String string = s1 + s2;
        char[] chars = string.toCharArray();
        Arrays.sort(chars);

        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars)
        {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet)
        {
            sb.append(character);
        }

        System.out.println(sb);

        return String.valueOf(sb);
    }

    //better solution
    public static String longestBetter (String s1, String s2)
    {
        String s = s1 + s2;
        return s.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}