package basics;

import java.util.Scanner;

public class DigitalRoot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println("Number is zero");
            return;
        }
        while (num>=10)
        {
            int sum=0;
            while(num!=0)
            {
                int digit=num%10;
                sum+=digit;
                num=num/10;
            }
            num=sum;
        }
        System.out.println("Digital Root is "+num);
    }
}
