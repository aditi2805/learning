package concepts.inheritance;

public class Parent {
  String name;
  Parent(String name) {
    this.name = name;
  }

  public void eat(String food) {
    System.out.println(name + " is eating " + food);
  }
}
