package learning.basics;
import java.util.Scanner;

class Variables {
    public void Num(double x){
        double i ;
        for(i=0 ; i<=10 ; i++){
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }
    public static void main(String[] args){
        Variables tab = new Variables();
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        x = sc.nextDouble();
        tab.Num(x);
    }
}
