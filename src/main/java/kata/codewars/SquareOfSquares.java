package kata.codewars;

public class SquareOfSquares
{
    //Given an integral number, determine if it's a square number

    public static void main(String[] args)
    {
        isSquare(-1);
    }

    //first solution
    public static boolean isSquare(int n)
    {
        double sqrt = Math.sqrt(n);
        int result = (int) Math.ceil(sqrt);

        if (Math.pow(result, 2) == n)
        {
            System.out.println("квадрат");
            return true;
        }

        else
        {
            System.out.println("не квадрат");
            return false;
        }
    }

    //short but no so accurate
    public static boolean isSquareShort(int n)
    {
        return Math.sqrt(n) % 1 == 0;
    }
}
