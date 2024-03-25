import java.util.*;
    public class Factorial{
        public static void main (String[]args)
    {
    int num;
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    num = input.nextInt();
    input.close();

    for (int num2 = num; num2 > 1; num2--)
    {
    num *= (num2-1);
    }

    System.out.print(num);
    }

}