package basics;

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to count its digit:");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("Contains 0 digit");
            return;
        }
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
    }
}
