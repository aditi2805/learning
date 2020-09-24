package learning.basics;

import static utils.Print.print;

public class LogicalOperator {
    public static void main(String[] args){
        //testAndOr();
        test2();
    }

    private static void test2() {
        int a = 5;
        if(8>5 && a-- == 5)
            print(a);
    }

    private static void testAndOr() {
        int p = 5, q = 5, r = 5, s = 5;
        if(8<5 && p--==4){
            print(p);
        }
        print("p === "+p);


        if(8>5 || --q<10){
            print(q);
        }
        print("q === "+q);


        if(8<5 && r-->0){
            print(r);
        }
        print("r === "+r);


        if(8>5 && s--==5){
            print(s);
        }
        print("s === "+s);
    }
}
