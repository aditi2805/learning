package codes.selection;

public class CharTest {

    public boolean isDigit(char ch){
        return (ch >= '0' && ch <= '9');
        // return ch >= 48 && ch <= 57;
       /* if  (ch >= '0' && ch <= '9'){
            return true;
        }
        return false;*/
    }

    public boolean isUpperCase(char ch){
        return ch >= 'A' && ch <= 'Z';
        // return ch >= 65 && ch <= 90;
    }

    public boolean isLowerCase(char ch){
        return ch >= 'a' && ch <= 'z';
        // return ch >= 97 && ch <= 122;
    }

    public char getLowerCase(char ch){
        /*
        boolean isUpper = isUpperCase(ch);
        if(isUpper){
            return (char) (ch + 32);
        }
        return ch;
        */
        if( isUpperCase(ch) ){             // if can contain methods as well.
            return (char) (ch + 32);
        }
        return ch;
    }

    public char getUpperCase(char ch){
        if( isLowerCase(ch) ){
            return (char) (ch - 32);
        }
        return ch;
    }
}
