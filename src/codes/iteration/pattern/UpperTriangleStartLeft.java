package codes.iteration.pattern;

public class UpperTriangleStartLeft {
    public void pattern4(){
        /*

        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *

         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void pattern5(){
        /*
        1
        2  2
        3  3  3
        4  4  4  4
        5  5  5  5  5
         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

    public void pattern6(){
        /*
        1
        1  2
        1  2  3
        1  2  3  4
        1  2  3  4  5
         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public void pattern7(){
        /*
        5
        4  4
        3  3  3
        2  2  2  2
        1  1  1  1  1

         */
        for(int i=5 ; i>=1 ; i--){
            for(int j=5 ; j>=i ; j--){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

    public void pattern8(){
        /*
        5
        5  4
        5  4  3
        5  4  3  2
        5  4  3  2  1

         */
        for(int i=5 ; i>=1 ; i--){
            for(int j=5 ; j>=i ; j--){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public void pattern9(){
        /*
        *
        #  #
        *  *  *
        #  #  #  #
        *  *  *  *  *

         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                if(i % 2 == 0){
                    System.out.print("#  ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void pattern10(){
        /*
        1
        2  1
        3  2  1
        4  3  2  1
        5  4  3  2  1

         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=i ; j>=1 ; j--){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public void pattern11(){
        /*
        5
        4  5
        3  4  5
        2  3  4  5
        1  2  3  4  5

         */
        for(int i=5 ; i>=1 ; i--){
            for(int j=i ; j<=5 ; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        UpperTriangleStartLeft up = new UpperTriangleStartLeft();
        //up.pattern4();
        //up.pattern5();
        //up.pattern6();
        //up.pattern7();
        //up.pattern8();
        //up.pattern9();
        //up.pattern10();
        up.pattern11();
    }
}
