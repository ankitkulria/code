package basics;

import java.util.Scanner;

public class DigitalRootWIthFormula {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println("Number is zero");
            return;
        }
        int digitalRoot =digitalRoot(num);
        System.out.println("Digital Root is "+digitalRoot);


    }
    static int digitalRoot(int num)
    {
        return 1+(num-1)%9;
    }
}
