package codes.selection;

public class DigitOrNot {
    public boolean isDigit(char ch){
        if(ch >= '0' && ch <= '9'){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        DigitOrNot dd= new DigitOrNot();
        boolean is = dd.isDigit('6');
    }
}
