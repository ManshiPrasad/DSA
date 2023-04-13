package Java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fun(n));
    }
    static boolean fun(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            int r2 = n % 10;
            n = n / 10;

            sum = sum + rem^ 3 + r2 ^ 3 + n ^ 3;
        }

            return sum == original ;
        }

    }

