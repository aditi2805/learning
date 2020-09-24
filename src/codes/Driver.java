package codes;

import codes.basics.Area;
import codes.basics.MyMaths;
import codes.selection.CharTest;
import codes.selection.OddEven;
import codes.selection.WeekDays;

import static utils.Print.print;

public class Driver extends OddEven{
    public static void main(String[] args) {
        // testArea();
        // testOddEven();
        // testMyMaths()
        //testChar();

        WeekDays wd = new WeekDays();
        print(wd.getDayName(1));
    }

    private static void testChar() {
        CharTest ct = new CharTest();
        char ch = ct.getLowerCase('A');
        print(ch);
        ch = ct.getLowerCase('z');
        print(ch);
        print(ct.isDigit('O'));   // upperCase letter O
        print(ct.isDigit('0'));   // digit 0
    }

    private static void testMyMaths() {
        MyMaths mm = new MyMaths();
        print(mm.getCeil(8.7));
        print(mm.getFloor(8.7));
        print(mm.getSquare(8.7));
    }

    private static void testOddEven() {
        OddEven objOddEven = new OddEven();
        objOddEven.printOddOrEven(5);
        boolean isEven = objOddEven.isEven(5);
        print(isEven);
    }

    private static void testArea() {
        Area objArea = new Area();
        double a = objArea.getAreaOfCircle(5);
        int aSquare = objArea.getAreaOfSquare(5);
        print(aSquare);
    }
}
