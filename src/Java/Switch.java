package Java;

import java.lang.Math;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choice:");
        byte choice = input.nextByte();
        switch (choice){
            case 1:
               // Scanner sc = new Scanner(System.in);
                System.out.println("Radius:");
                float radius = input.nextByte();

                double AREA =  (Math.PI*radius*radius);
                System.out.format("AREA:%.2f",AREA);
                break;

            case 2:
               // Scanner reader = new Scanner(System.in);
                System.out.println("Length:");
                float length = input.nextByte();
                System.out.println("Breadth:");
                float breadth= input.nextByte();

                float area =  (length * breadth);
                System.out.println("AREA:"+area);
                break;


            default:
                System.out.println("INVALID"  );

        }


    }
}
