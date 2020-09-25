package concepts;

public class MethodInvocation {
    public static int sum(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int absDifference(int x, int y) {
        int diff1 = sub(x, y);
        int diff2 = sub(y, x);
        return diff1 > 0 ? diff1 : diff2;
    }

    public int multiplyBy2(int n) {
        int sum = sum(n, n);
        return sum;
    }

    public static void divide(int a, int b) {
        int sum = sum(a, b);
        //int sub = sub(a, b);
    }

    public static void main(String[] args) {
        sum(2, 3);
        //sub(2, 6);
    }
}
