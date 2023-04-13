package Java;

public class swap {

    public static void main(String[] args) {

        int a=10;
        int b= 20;
        swap(a,b);
        System.out.println(a+" "+b);
    }

    static void swap(int a,int b) {

        int  s = a ;
           a = b;
           b=s;
        System.out.println("a:"+a);
    }
}

