package codes.String;

import java.util.Scanner;

/**
 * WAP to count the number of characters in a program
 */
public class L1CountChars {
  public static int charCount(String str) {
    return str.length();
  }

  public int charCountNonStatic(String str) {
    return str.length();
  }

  public static void main(String[] args) {
    /*calling a static method.
     * a static method belongs to a class, and is accessible to all member of the class.
     * static members can directly be called using class names, No need to create object
     */
    int count = charCount("My name is aditi");
    System.out.println(count);

    // same as above one, but since the static method is in same class, it can be directly called
    int count1 = L1CountChars.charCount("this is using class name");
    System.out.println(count1);
    /*
    * calling a non-static method:
    * a non-static method belongs to an instance of a class.
    * For calling a non-static method, an instance(object) of the class needs to be created
    */
    L1CountChars obj = new L1CountChars();
    int count2 = obj.charCountNonStatic("your name is pankaj");
    System.out.println(count2);

  }
}
