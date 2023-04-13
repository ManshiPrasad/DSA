package Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int y = pal(n);

            if (n==y){
                System.out.println("YES");;
            }
           else {
                System.out.println("NO");
            }

        }

    static int pal(int n) {
        int x = n;
        int sum = 0;

        while (x > 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }
        return sum;
    } }








