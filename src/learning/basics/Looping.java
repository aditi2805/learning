package learning.basics;
import java.util.Scanner;
class Looping {
    public static void main(String[] args) {
        /*int i=5 , j=10;
        if((i<j) || j>i)
            System.out.println("OK");
            System.out.println("NOT OK");*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("Enter the third number");
        int z = sc.nextInt();
        int max = 0;
        max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("MAXIMUM OF THREE NUMBERS IS : " + max);
    }
}
