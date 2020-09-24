package codes.iteration.pattern;

public class Pattern_21 {
    public static void main(String[] args) {
        for(int i=5 ; i>=1 ; i--){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
