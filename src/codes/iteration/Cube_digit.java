package codes.iteration;

public class Cube_digit {
    public long sum(int n ){
        long sum = 0;
        int temp = n ;
        int rem ;
        while (n > 0 ){     // 123 --- 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10 ;
        }
        System.out.println("Sum of cubes of number : " + temp + " is  : " + sum );
        return sum;
    }

    public static void main(String[] args) {
        Cube_digit cd = new Cube_digit();
        cd.sum(123);
    }
}
