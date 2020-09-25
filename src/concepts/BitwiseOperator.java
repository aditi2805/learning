package concepts;

import static utils.Print.print;

public class BitwiseOperator {
    public static void main(String[] args) {
//        testNot();
//        testAnd();
//        testOr();
//        testXor();
        testShift();
    }

    private static void testShift() {
        print(32>>34);     // equal to 32>>2

        print((byte)(417.35));   // -95
    }

    private static void testXor() {
        print(5 ^ 7);           // 2
        print(false ^ false);   // false
        print(false ^ true);    // true
        print(true ^ false);    // true
        print(true ^ true);     // false
    }

    private static void testOr() {
        print(5 | 7);       // 7
        print((2<3)|(5>7)); // true
        print(false | false);   // false
        print(false | true);    // true
        print(true | false);    // true
        print(true | true);     // true

    }

    private static void testAnd() {
        int n = 14;
        print(5 & 9);
        print(6 & 5);
        print(14 & 12);
        print(n & (n-1));

        print(false & false);   // false
        print(false & true);    // false
        print(true & false);    // false
        print(true & true);     // true
    }

    private static void testNot() {

      // ~x = -(x+1)

        print("~10 = " + ~10);     // -11
        print("~-10 = " + ~-10);   // 9
        print("~0 = " + ~0);       // -1
    }
}