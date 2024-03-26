import java.util.*;
    public class OddSum{
        public static void main (String[]args)
    {
    int sum;
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an odd number: ");
    int num = input.nextInt();
    input.close();

    for (int num2 = 1; num2 <= num; num2 = num2 + 2)
    {
    sum += (num2);
    }

    System.out.print(sum);
    }

}