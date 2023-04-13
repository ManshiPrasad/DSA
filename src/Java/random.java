package Java;

import java.util.Scanner;

public class random {
    static int count_digits(int n) {
        int x = n;
        int count = 0;
        while ( x >0) {
            int rem = x%10;
            if(rem!=0 && x%rem==0)
            count++;
            x = x / 10;
     }
        return count;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no");
        int n = in.nextInt();

        System.out.println("Number of digits which divide  "+n+" evenly is "+count_digits(n));
    }
}

