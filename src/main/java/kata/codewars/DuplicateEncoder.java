package kata.codewars;

public class DuplicateEncoder
{
    //The goal of this exercise is to convert a string to a new string where each character in the new string is
    //"(" if that character appears only once in the original string, or ")"
    //if that character appears more than once in the original string.
    //Ignore capitalization when determining if a character is a duplicate.

    public static void main(String[] args)
    {
        encode("Prespecialized");
    }

    static String encode(String word)
    {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < word.length(); i++)
        {
            int charPosition = i;
            String result = word.toLowerCase();

            long a = result.chars().filter(num -> num == result.charAt(charPosition)).count();

            if (a > 1)
            {
                newString.append(")");
            }
            else
            {
                newString.append("(");
            }
        }

        return String.valueOf(newString);
    }
}