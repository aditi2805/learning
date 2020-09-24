package codes.iteration;

import java.util.Scanner;

public class ReverseWordSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st, st1 = "", st2 = "";
        int i, l;
        char ch;
        System.out.println("Enter a Sentence");
        st = sc.nextLine();
        st = st + " ";
        l = st.length();
        for (i = 0; i < l; i++) {
            ch = st.charAt(i);
            if (ch != ' ') {
                st1 = ch + st1;
            } else {
                st2 = st1 + " " + st2;
                st1 = "";
            }
        }
        System.out.println("INPUT: " + st);
        System.out.println("OUTPUT: " + st2);
    }
} /*
computer is fun
INPUT: computer is fun
OUTPUT: nuf si retupmoc
*/

