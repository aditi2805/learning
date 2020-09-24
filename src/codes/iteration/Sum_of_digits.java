package codes.iteration;

public class Sum_of_digits {
    public long sumOfDigits(int n){
        int temp = n;
        long sum = 0;
        /*
        while(n > 0 ){
            sum = sum + n % 10 ;
            n = n / 10;
        }
        */

        for(int i = n ; i > 0 ; i = i/10){
            sum = sum + 1 % 10 ;  // galat
        }



        System.out.println("INPUT NUMBER : "+ temp );
        System.out.println("Sum of digits of number : "+ temp + " is : "+ sum);
        return sum;
    }

    public static void main(String[] args) {
        Sum_of_digits sod = new Sum_of_digits();
        sod.sumOfDigits(12345);
    }
}
