package codes.array;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array..");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        int i,j;
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt() ;
        }
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
