package basics;

import java.util.Scanner;

public class SumOfOddDigits {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num == 0 || num < 0) {
            System.out.println("Number is zero or negative");
            return;
        }
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num = num / 10;
        }
        System.out.println("The sum of odd digits is: " + sum);
    }
}
