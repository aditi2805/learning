package codes.iteration;

public class Sum_Odd {
    public int sumOfOddDigits(int n) {
        int o, so = 0;
        long sum = 0;
        while (n > 0) {
            o = n % 10;
            if (o % 2 == 1) {
                so += o; //so = so + o;
            }
            n = n / 10;
        }
        System.out.println("Sum of odd numbers in a given number = " + so);
        return so;
    }

    public static void main(String[] args) {
        Sum_Odd SO = new Sum_Odd();
        SO.sumOfOddDigits(12345);
    }
}
