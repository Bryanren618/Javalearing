public class Animal {

  Animal() {}

  Animal(String name) {
    this.name = name;
  }

  double weight;
  String color;
  int age;
  String name;

  public void eat() {
    System.out.println(name + " Eat!");
  }
}
