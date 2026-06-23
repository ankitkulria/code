package basics;

import java.util.Scanner;

public class CountEvenDigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find even digits:");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("The number is zero");
            return;
        }
        int count=0;
        while(num!=0)
        {
            int digit=num%10;
            if(digit%2==0)
            {
                count++;
            }
            num/=10;
        }
        System.out.println("Number of even digits: "+count);
    }
}
