package codes.iteration;

public class Reverse_sum {
    public long sum (int n ) {
        long sum = 0;
        int temp = n;
        int rev = 0, rem = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        sum = rev + temp;
        System.out.println("INPUT NUMBER : " + temp);
        System.out.println("REVERSE OF " + temp + " is : " + rev);
        System.out.println("SUM OF "+ temp + " AND " + rev + " is : " + sum);
        return rev;
    }

    public static void main(String[] args) {
        Reverse_sum rs = new Reverse_sum();
        rs.sum(123);
    }
}
