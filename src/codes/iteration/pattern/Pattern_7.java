package codes.iteration.pattern;

public class Pattern_7 {
    public static void main(String[] args) {
        for(int i=5 ; i>=1 ; i--){
            for(int j=5 ; j>=i ; j--){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
