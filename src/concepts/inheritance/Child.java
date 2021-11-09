package concepts.inheritance;

public class Child extends Parent{
  String name;
  Child(String name){
    super(name);
    this.name = name;
  }
  public void eat(String food) {
    System.out.println(name + " is eating " + " " + food);
//    return "";
  }

  public static void main(String[] args) {
    Child c = new Child("Aditi");
    c.eat("chocolate");
  }
}
