package basics;

import java.util.Scanner;

public class ProductOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println("The product is zero");
        }
        int product = 1;
        while(num!=0)
        {
            int digit = num % 10;
            product *= digit;
            num = num/10;
        }
        System.out.println("The product is "+product);
    }
}
