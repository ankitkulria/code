package basics;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count zeroes: ");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("The number itself is zero");
            return;
        }
        int count=0;
        while(num!=0)
        {
            int digit=num%10;
            if(digit==0)
            {
                count++;
            }
            num/=10;
        }
        System.out.println("The number of zeroes in number: "+count);
    }
}
