package codes.array;
import java.util.Scanner;
public class CountPositiveNumber {

    public int getPositiveCount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input count");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers");
        int arr[] = new int[n];
        int count=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= 0){
                count++;
            }
        }
        System.out.println("Number of positive numbers in Array : " + count);
        return count;
    }

    public static void main(String[] args) {
        CountPositiveNumber cp = new CountPositiveNumber();
        cp.getPositiveCount();
    }
}
