package codes.array;
import java.util.Scanner;
public class LeastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of input..!");
        int n = sc.nextInt();
        String arr[] = new String[n];
        int min = Integer.MAX_VALUE;
        String res = "";
        int lenstr = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
            lenstr = arr[i].length();
            if(lenstr < min ) {
                min = lenstr;
                res = arr[i];
            }
        }
        System.out.println(res);
        System.out.println(min);
    }
}
