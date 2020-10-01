package codes.array;
import java.util.Scanner;

public class Sum {

    public int[] input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number of inputs");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public long getSum(int[] arr){
        int len = arr.length;
        long sum= 0 ;
        for(int i=0; i<len; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array's number : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Sum ss = new Sum();
        int[] arr = ss.input();
        Max mm = new Max();
        ss.getSum(arr);
        mm.getMax(arr);
    }
}
