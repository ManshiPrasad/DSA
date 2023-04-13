package Java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int x = in.nextInt();

        for (int i=0;i<x;i++){
            int count = 0;
            int n = in.nextInt();
            for (int div = 1;div<=n;div++){
                if (n%div ==0){
                    count++;
                }
            }
            if (count==2) { System.out.println("PRIME"); }
                        else {
                    System.out.println("COMPOSITE");
            }
        }

    }
}
