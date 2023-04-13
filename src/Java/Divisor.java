package Java;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int a = in.nextInt();
        System.out.println("Divisors are:");
         for (int b=1; b<=a;b++){
             if (a%b==0){
                 int div = b;
                 System.out.println(" "+b);
             }
         }
    }
}
