package basics;

import java.util.Scanner;

public class ReverseInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int reversed = 0;
        while (num!=0)
        {
            int  digit = num%10;
            num = num/10;
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return;

            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return;

            reversed = reversed*10+digit;

        }
        System.out.println("Reversed number: "+reversed );
    }
}
