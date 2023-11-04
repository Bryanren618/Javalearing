class Dog extends Animal {

  Dog() {}

  Dog(String name) {
    this.name = name;
  }

  int speed;

  public void bark() {
    System.out.println("Woo!");
  }

  @Override
  public void eat() {
    System.out.println(name + " Woo!Eat!"); //polymorphism: 2.子类重写父类方法
  }

  @Override
  public String toString() {
    return "This is " + name;
  }

  /*polymorphism: 1.子类继承父类
   * 2.子类重写父类方法
   * 3.父类引用指向子类
   */
  public static void main(String[] args) {
    Animal nana = new Dog(); // polymorphism: 3.父类引用指向子类
    Dog hachi = new Dog();
    Animal[] array = { nana, hachi };
    hachi.name = "hachi";
    hachi.eat();
    hachi.bark();
    System.out.println(hachi.toString());
    System.out.println(hachi);
  }
}
