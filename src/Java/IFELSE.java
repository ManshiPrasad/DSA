package Java;

import java.util.Scanner;

public class IFELSE {

   public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
       System.out.println("Input");
       int n = input.nextInt();
       int m = input.nextInt();
      // int n = 200;
      // int m = 200;
       if (n < m) {
           System.out.println("lesser");
       } else if (n == m) {
           System.out.println("equal");
       } else{
                   System.out.println("greater");
               }
           }
       }

