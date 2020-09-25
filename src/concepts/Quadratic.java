package concepts;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'a, b & c ' for Quadratic Equation");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d, root_1, root_2 ;
        if(a==0){
            System.out.println(" 'a' can't be '0' ...sorry not executable!");
        }
        else {
            d = b * b - 4 * a * c;
            if (d > 0) {
                root_1 = (-b + Math.sqrt(d)) / (2 * a);
                root_2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots are unequal & real ");
                System.out.println("Root 1 : " + root_1 +  "/nRoot 2 : " + root_2);
            }
            else if (d == 0) {
                root_1 = -b/(2*a);
                root_2 = root_1;
                System.out.println("Roots are real & equal");
                System.out.println("Root 1 : " + root_1 + "/nRoot 2 : " + root_2);
            }
            else{
                System.out.println("Roots are unequal & imaginary");
            }
        }
    }
}
