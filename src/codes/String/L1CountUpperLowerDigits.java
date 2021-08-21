package codes.String;

/**
 * WAP to count number of uppercase chars, lowercase chars and digits.
 */
public class L1CountUpperLowerDigits {
  // THEORY
  // uppercase unicode: 65-90
  // lowercase unicode: 97-122
  // digits unicode: 48-57
  // space: 32

  // Java uses 2 byte (16 bits) unicode: (utf-16)
  // that is why char size in java is 2 bytes

  // unicode comes in different forms
  // utf-8 : minimum 8 bits for each character representation
  // utf-16: minimum 16 bits
  // utf-32: minimum 32 bits

  // previously, ASCII codes were used:
  // ascii char used 7 bits, ie from 0-127 (0 - 2^7 - 1 )
  public static void printCount(String str) {
    int len = str.length();
    char ch;
    int upperCount=0;
    int lowerCount=0;
    int digitCount=0;
    for(int i=0;i < len; i++){
      ch = str.charAt(i);

      // check upper case
      // can also be written as (ch>='A' && ch<='Z')
      if(ch>=65 && ch<=90){
        upperCount++;
      }
      // count lower
      else if(ch>='a' & ch<='z') {
        lowerCount++;
      }
      // count digits
      else if(ch>=48 && ch<= 57) {
        digitCount++;
      }
    }
    System.out.println("Upper case count " + upperCount);
    System.out.println("Lower case count " + lowerCount);
    System.out.println("Digits count " + digitCount);
  }

  public static void main(String[] args) {
    printCount("This is my number +91 9097439539");
  }
}
