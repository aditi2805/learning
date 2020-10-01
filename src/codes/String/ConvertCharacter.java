package codes.String;

public class ConvertCharacter {
    public void encode(String st) {
        String res = "";
        int len = st.length();
        char ch;
        for (int i = 0; i < len; i++) {
            ch = st.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'x') {
                    ch = 'a';
                } else if(ch == 'X') {
                    ch = 'A';
                } else if (ch == 'y') {
                    ch = 'b';
                } else if(ch == 'Y') {
                    ch = 'B';
                } else if(ch == 'z') {
                    ch = 'c';
                } else if(ch == 'Z') {
                    ch = 'C';
                } else{
                    ch =  (char)(ch + 3);
                }
            }
            res = res + ch;
        }
        System.out.println(res);
    }

    public void decode(String st) {
        String res = "";
        int len = st.length();
        char ch;
        for (int i = 0; i < len; i++) {
            ch = st.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a') {
                    ch = 'x';
                } else if(ch == 'A') {
                    ch = 'X';
                } else if (ch == 'b') {
                    ch = 'y';
                } else if(ch == 'B') {
                    ch = 'Y';
                } else if(ch == 'C') {
                    ch = 'Z';
                } else if(ch == 'c') {
                    ch = 'z';
                } else{
                    ch =  (char)(ch - 3);
                }
            }
            res = res + ch;
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        ConvertCharacter cc = new ConvertCharacter();
        cc.encode("My name is Aditi....!" );
        cc.decode("Pb qdph lv Dglwl....!");
    }
}
