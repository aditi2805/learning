package learning.basics;

public class Outputs {
    /*void func(String s) {
        String s1 = s + "xyz";
        System.out.println("S1 = " + s1);
        System.out.println("s = " + s);
    }*/
    static int m = 0;
    static int n = 0;

    public static void main(String[] args) {
        int m = 10;
        {
            int n = 30;
            System.out.println( m + n + " = m + n ");
            System.out.println("m + n = " + m + n);
            System.out.println("m + n = " + (m+n));
        }
        int x = m + n;
        System.out.println("X = " + x);
    }
}

