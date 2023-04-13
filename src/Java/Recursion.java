package Java;

public class Recursion {
    public static void main(String[] args) {
        print1(1);
    }
        public static void print1(int n) {
            System.out.println(n);
            print2(2);
        }
       public static void print2(int n){
            System.out.println(n);
        }
    }

