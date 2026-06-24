package basics;

import java.util.Scanner;

public class PalindromeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while(num!=0)
        {
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num/10;
        }
        if(original==reversed)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
