package codes.iteration.pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
