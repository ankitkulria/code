package basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count frequency of digits : ");
        int num=sc.nextInt();

        Map<Integer,Integer> frequency=new HashMap<>();

        if(num==0)
        {
            frequency.put(0,1);
        }
        num = Math.abs(num);
        while(num!=0)
        {
            int digit=num%10;
            frequency.put(digit,frequency.getOrDefault(digit,0)+1);
            num/=10;
        }
        System.out.println(frequency);
    }
}
