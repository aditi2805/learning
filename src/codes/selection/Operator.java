package codes.selection;

public class Operator {
    double res;
    public double Cal(char ch ,double a , double b ) {
        switch (ch) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            case '%':
                res = a % b;
                break;
            case '^':
                res = Math.pow(a,b);
                break;
            case 's':
                res = Math.sqrt(a);
                break;
            case 'e':
                res = Math.cbrt(a);
                break;
            default:
                System.out.println("Wrong input");
        }
        return res;
    }

    public static void main(String[] args) {
        Operator op = new Operator();
        double cal = op.Cal('^',4,2);
        System.out.println(cal);
    }
}
