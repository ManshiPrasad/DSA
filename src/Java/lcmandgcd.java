package Java;

import java.util.Scanner;

public class lcmandgcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int o1 = n1;
        int o2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n2 = n1;
            n1 = rem;
        }
        int gcd = n1;
        int lcd = (o1*o2)/gcd ;
        System.out.println("lcd:"+lcd+" gcd:"+gcd);
      }
}
