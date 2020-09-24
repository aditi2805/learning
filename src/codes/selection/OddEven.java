package codes.selection;

import static utils.Print.print;

public class OddEven {

    public boolean isEven(int n){
        return n % 2 == 0;
    }

    public boolean isOdd(int n){
        return n % 2 == 1;
    }

    public int getOddOrEven(int n){
        if (n % 2 == 0){
            return 0;
        }
        return 1;
    }

    public void printOddOrEven(int n){
        if (n % 2 == 0){
            print("Even");
        } else {
            print("Odd");
        }
    }
}
