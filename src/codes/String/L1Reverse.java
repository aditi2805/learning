package codes.String;

public class L1Reverse {
    public static String reverse(String str) {
      int len = str.length();
      char ch;
      String rev = "";
      for(int i = len-1; i >=0; i--) {
          ch = str.charAt(i);
          rev = rev+ch;
      }
      return rev;
    }

  public static void main(String[] args) {
    String rev = reverse("My name is Aditi");
    System.out.println(rev);
  }
}
