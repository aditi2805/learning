package concepts;

import codes.String.L1CountChars;

public class StaticVsNonStatic {
  public static int charCount(String str) {
    return str.length();
  }

  public int charCountNonStatic(String str) {
    return str.length();
  }

  public static boolean isVowelStatic(char ch) {
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U' ) {
      return true;
    }
    return false;
  }
  public boolean isVowelNonStatic(char ch) {
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U' ) {
      return true;
    }
    return false;
  }

  public static int countVowelStatic(String str) {
    int len = str.length();
    int count = 0;
    char ch;
    for(int i =0;i<len;i++) {
      ch = str.charAt(i);
      // DOES  NOT WORK:
      // a non-static method cannot be directly called from a static method.
      // an object needs to be created. (same as main method, since main method is also static)
      //  boolean isVowel = isVowelNonStatic(ch);

      // WORKS
      // a static method can be called into another static method directly
      boolean isVowel = isVowelStatic(ch);
      if(isVowel){
        count++;
      }
    }
    return count;
  }

  public int countVowelNonStatic(String str) {
    int len = str.length();
    int count = 0;
    char ch;
    for(int i =0;i<len;i++) {
      ch = str.charAt(i);
      // WORKS
      // a non-static method can be called into another non-static method directly "in the same class"
//      boolean isVowel = isVowelNonStatic(ch);

      // WORKS
      // calling a static method into non-static method
      // because static methods belong to class level and is accessible to all members of the class
      boolean isVowel = isVowelStatic(ch);
      if(isVowel){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    // CONCEPT 1:
    /*calling a static method.
     * a static method belongs to a class, and is accessible to all member of the class.
     * static members can directly be called using class names, No need to create object
     */
    int count = charCount("My name is aditi");
    System.out.println(count);

    // same as above one, but since the static method is in same class, it can be directly called
    int count1 = StaticVsNonStatic.charCount("this is using class name");
    System.out.println(count1);

    // CONCEPT 2
    /*
     * calling a non-static method:
     * a non-static method belongs to an instance of a class.
     * For calling a non-static method, an instance(object) of the class needs to be created
     */
    StaticVsNonStatic obj = new StaticVsNonStatic();
    int count2 = obj.charCountNonStatic("your name is pankaj");
    System.out.println(count2);


    //    CONCEPT 3
    // caller                called function

    // Static                Static                         : works
    // Static                Non-static                     :** No, needs an object
    // non-static            Static                         : works
    // non-static            non-static                     : works iff it is in same class
    //                                                      : needs an object if it is in another class
  }
}
