package basics;

import java.util.Scanner;

public class DigitFrequencyWithArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int[] freq = new int[10];
        while (num!=0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }
        System.out.println("The frequency of digits in the array is: ");
        for(int i=0;i<freq.length;i++)
        {
            System.out.println(i+" -> "+freq[i]);
        }
        sc.close();
    }
}
