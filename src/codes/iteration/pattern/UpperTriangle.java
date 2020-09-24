package codes.iteration.pattern;

public class UpperTriangle {
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

    public static void main(String[] args) {
        UpperTriangle up = new UpperTriangle();
        up.pattern6();
    }
}
