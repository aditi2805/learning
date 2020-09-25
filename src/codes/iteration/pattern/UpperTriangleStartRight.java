package codes.iteration.pattern;

public class UpperTriangleStartRight {
    public void pattern26(){
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *

         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern27(){
        /*
                1
              2 2
            3 3 3
          4 4 4 4
        5 5 5 5 5

         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public void pattern28(){
        /*
                5
              4 4
            3 3 3
          2 2 2 2
        1 1 1 1 1
         */
        for(int i=5 ; i>=1 ; i--){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void pattern29(){
        /*
                1
              1 2
            1 2 3
          1 2 3 4
        1 2 3 4 5
         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern30(){
        /*
                1
              2 1
            3 2 1
          4 3 2 1
        5 4 3 2 1

         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=i ; j>=1 ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern31(){
        /*
               5
              5 4
            5 4 3
          5 4 3 2
        5 4 3 2 1
         */
        for(int i=5 ; i>=1 ; i--){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern32(){
        /*
                5
              4 5
            3 4 5
          2 3 4 5
        1 2 3 4 5
         */
        for(int i=5 ; i>=1 ; i--){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=i ; j<=5 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpperTriangleStartRight up = new UpperTriangleStartRight();
        up.pattern26();
        //up.pattern27();
        //up.pattern28();
        //up.pattern29();
        //up.pattern30();
        //up.pattern31();
        //up.pattern32();
    }
}
