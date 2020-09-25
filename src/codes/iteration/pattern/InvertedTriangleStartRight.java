package codes.iteration.pattern;

public class InvertedTriangleStartRight {
    public void pattern19(){
        /*
          * * * * *
            * * * *
              * * *
                * *
                  *
         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern20(){
        /*
        1 1 1 1 1
          2 2 2 2
            3 3 3
              4 4
                5
         */
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

    public void pattern21(){
        /*
        5 5 5 5 5
          4 4 4 4
            3 3 3
              2 2
                1

         */
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

    public void pattern22(){
        /*
        1 2 3 4 5
          1 2 3 4
            1 2 3
              1 2
                1
         */
        for(int i=5 ; i>=1 ; i--){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public void pattern23(){
        /*
         1 2 3 4 5
           2 3 4 5
             3 4 5
               4 5
                 5
         */
        for(int i=1 ; i<=5 ; i++){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=i ; j<=5 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern24(){
        /*
        5 4 3 2 1
          5 4 3 2
            5 4 3
              5 4
                5

         */
        for (int i=1 ; i<=5 ; i++){
            for(int x=1 ; x<i ; x++){
                System.out.print("  ");
            }
            for(int j=5 ; j>=i ; j-- ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern25(){
        /*
        5 4 3 2 1
          4 3 2 1
            3 2 1
              2 1
                1

         */
        for(int i=5 ; i>=1 ; i--){
            for(int x=5 ; x>i ; x--){
                System.out.print("  ");
            }
            for(int j=i ; j>=1 ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedTriangleStartRight it = new InvertedTriangleStartRight();
        //it.pattern19();
        //it.pattern20();
        it.pattern21();
        //it.pattern22();
        //it.pattern23();
        //it.pattern24();
        //it.pattern25();
    }
}
