package codes.selection;

public class Positive_Negative {
    public void check(int n){
        if(n > 0){
            System.out.println("Number is positive");
        }
        else if(n < 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args) {
        Positive_Negative pn = new Positive_Negative();
        pn.check(66);
    }
}
