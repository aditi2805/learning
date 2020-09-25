package concepts;
import java.util.Scanner;
class Functions {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number --- 1 ");
            double x = sc.nextDouble();
            System.out.println("Enter a number --- 2");
            double y = sc.nextDouble();
            double abs = Math.abs(x);
            double ceil = Math.ceil(x);
            double floor = Math.floor(x);
            double pow = Math.pow(x,y);
            double s = Math.sqrt(x);
            double rin = Math.rint(x);
            double round = Math.round(x);
            System.out.println("Absolute of " + x + " is = " + abs);
            System.out.println("Ceil of " + x + " is = " + ceil);
            System.out.println("Floor of " + x + " is = " + floor);
            System.out.println(x + " reaised to power " + y + " is =  " + pow);
            System.out.println("Square root " + x + " is = " + s);
            System.out.println("Rint of " + x + " is = " + rin);
            System.out.println("Rounded value of  " + x + " is = " + round);
        }
}
