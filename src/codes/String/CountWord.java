package codes.String;

public class CountWord {
    public int count(String st, String key) {
        st = st.trim();
        st = st + " ";
        int len = st.length();
        String word = "";
        char ch;
        int c = 0;
        for (int i = 0; i < len; i++) {
            ch = st.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.equalsIgnoreCase(key)) {
                    c++;
                }
                word = "";
            }
        }
        System.out.print("Count of "+ key +" in String "+ st + " is : "+ c  );
        return c;
    }

    public static void main(String[] args) {
        CountWord cw = new CountWord();
        cw.count("My name is aditi my oh my My MY my" , "my");
    }
}

