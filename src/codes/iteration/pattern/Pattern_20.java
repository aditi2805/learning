package codes.iteration.pattern;

public class Pattern_20 {
    public static void main(String[] args) {
        for(int i=1 ; i<=5 ; i++){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
