import java.util.*;
    public class OddSum{
        public static void main (String[]args)
    {
    int num;
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an odd number: ");
    num = input.nextInt();
    input.close();

    for (int num2 = 1; num2 <= num; num2 += 2)
    {
    num *= (num2-1);
    }

    System.out.print(num);
    }

}