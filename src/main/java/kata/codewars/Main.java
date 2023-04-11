package kata.codewars;

public class Main
{
    public static void main(String[] args)
    {
        String[] w = solution("vav");
        System.out.println(w);
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