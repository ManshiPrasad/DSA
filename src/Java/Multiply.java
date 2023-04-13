package Java;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = in.nextInt();
        for (int i=1;i<=10;i++) {
            int m = n*i;
            System.out.print(" "+m);
        }
    }
}
