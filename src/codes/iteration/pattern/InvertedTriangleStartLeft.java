package codes.iteration.pattern;

public class InvertedTriangleStartLeft {
    public void pattern13() {
        /*
        *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        *

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void pattern14() {
        /*
        1  1  1  1  1
        2  2  2  2
        3  3  3
        4  4
        5

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }


    public void pattern15() {
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern16(){
        /*
        5 5 5 5 5
        4 4 4 4
        3 3 3
        2 2
        1

         */
        for(int i=5 ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void pattern17(){
        /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5

         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=5 ; j>=i ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern18(){
        /*
         *  *  *  *  *
         #  #  #  #
         *  *  *
         #  #
         *

         */
        for(int i=5 ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                if(i % 2 == 1) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedTriangleStartLeft it = new InvertedTriangleStartLeft();
        it.pattern13();
        //it.pattern14();
        //it.pattern15();
        //it.pattern16();
        //it.pattern17();
        //it.pattern18();
    }
}




