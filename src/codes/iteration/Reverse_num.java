package codes.iteration;

public class Reverse_num {
    public int rev(int n ){
        int temp = n ;
        int rev = 0 , rem = 0;
        while (n > 0 ){
            rem = n % 10 ;
            rev = rev * 10 + rem;
            n = n / 10 ;
        }
        System.out.println("INPUT NUMBER : " + temp );
        System.out.println("REVERSE OF " + temp + " is : " + rev);
        return rev;
    }

    public static void main(String[] args) {
        Reverse_num rn = new Reverse_num();
        rn.rev(12345);
    }
}
