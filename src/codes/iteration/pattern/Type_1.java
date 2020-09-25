package codes.iteration.pattern;

public class Type_1 {
    public void pattern1(){
        /*

        * * * * *
        * * * * *
        * * * * *
        * * * * *

        */
        for(int i=1 ; i<=4 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(){
        /*
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
         */
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=5 ; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        /*
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
         */
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=5 ; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Type_1 tt = new Type_1();
        //tt.pattern1();
        //tt.pattern2();
        tt.pattern3();
    }
}
