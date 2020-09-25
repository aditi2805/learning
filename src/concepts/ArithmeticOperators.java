package concepts;

import static utils.Print.print;

public class ArithmeticOperators {
    public static void main(String[] args) {
        print(14/6);
        print(14%6);
        print("-----------");
        print(-14/6);
        print(-14%6);
        print("-----------");
        print(14/-6);
        print(14%-6);
        print("-----------");
        print(-14/-6);
        print(-14%-6);

        print(5%2*6+3/6.0*5/2);
        print("5"+"6");
        print(5+6);
        print("5"+62);
        print("5"+6+2);
        print(5+"6" + "2");
        print(5+"6" + 2+1);
        print(5+6+2+5+1+1+"13");
        print(10000+5+6+"2"+1+3);
    }
}
