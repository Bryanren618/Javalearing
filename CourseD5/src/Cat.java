public class Cat {

  String name;
  String color;
  int age;
  String type = "Blue Cat";
  double weight;
  static int number_of_feet = 4;

  Cat() {}/*Empty Constructor, if not rewrite, this will be out of function */

  Cat(String name) {
    this.name = name;
  }

  Cat(String name, String color, int age) {
    this(name);
    this.color = color;
    this.age = age;
  }

  public void eat() {
    System.out.println(name + " is Fulled");
  }

  public static void main(String[] args) {
    Cat jojo = new Cat("jojo", "yellow", 5);
    jojo.eat();

    Cat popo = new Cat("popo", "blue", 7);
    popo.eat();
    System.out.println(number_of_feet);
  }
}
