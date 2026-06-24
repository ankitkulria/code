package basics;

import java.util.Scanner;

public class StrongNumber {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int strong=0;
        while (num>0)
        {
            int digit = num%10;
            strong=strong+factorial(digit);
            num=num/10;
        }
        if(original==strong)
        {
            System.out.println("The number is a strong number");
            System.out.println("Original number: "+original);
            System.out.println("Strong number: "+strong);
        }
        else
        {
            System.out.println("The number is not a strong number");
        }
    }
    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
