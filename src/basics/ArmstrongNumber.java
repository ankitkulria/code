package basics;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int arm=0;
        while(num>0)
        {
            int digit=num%10;
            count++;
            num=num/10;
        }
        num=original;
        while(num>0)
        {
            int digit=num%10;
            arm=arm+(int) Math.pow(digit,count);
            num=num/10;
        }
        if(arm==original)
        {
            System.out.println("Arm strong number");
        }
        else
        {
            System.out.println("Not an arm strong number");
        }
    }
}
