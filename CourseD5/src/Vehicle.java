import java.util.Scanner;

public class Vehicle {

  String name;
  int speed;
  int maxspeed;
  int position;
  static int road;

  //---------Default Constructor---------
  Vehicle() {}

  //---------Constructor for new Vehicle---------
  Vehicle(String name) {
    this.name = name;
    speed = 0;
    position = 0;
    maxspeed = 120;
    road = 1000;
    this.instruction(name);
  }

  //---------Method to give instructions---------
  public void instruction(String name) {
    System.out.println(
      name +
      " is waiting for your instructions: \n 1.Move\n 2.Speed Up\n 3.Speed Down\n 4.Check Position"
    );
    Scanner scanner = new Scanner(System.in);
    int order = scanner.nextInt();
    switch (order) {
      case 1:
        this.move();
        this.instruction(name);
        break;
      case 2:
        this.speedUp();
        this.instruction(name);
        break;
      case 3:
        this.speedDown();
        this.instruction(name);
        break;
      case 4:
        this.locate();
        this.instruction(name);
        break;
      default:
        System.out.println("Unidentified Input");
        this.instruction(name);
        break;
    }
    scanner.close();
  }

  //---------Method for Vehicle to move---------
  public void move() {
    if (position < road) {
      if (speed != 0) {
        position += speed;
        System.out.println("Speed rightnow is :" + speed + " km/h");
        this.instruction(name);
      } else {
        speed += 10;
        position += speed;
        System.out.println("Go!");
        System.out.println("Speed rightnow is :" + speed + " km/h");
      }
    } else {
      System.out.println(name + " has reaching goal!");
    }
  }

  //---------Method for Vehicle to speed up---------
  public void speedUp() {
    if (speed == 0) {
      System.out.println("Car is stopping now");
      this.instruction(name);
    } else if (speed < maxspeed) {
      speed += 10;
      System.out.println("Speed rightnow is :" + speed + " km/h");
      this.instruction(name);
    } else {
      System.out.println("Reaching speed limit: " + speed + " km/h");
      this.instruction(name);
    }
  }

  //---------Method for Vehicle to speed down---------
  public void speedDown() {
    if (speed > 0) {
      speed -= 10;
      System.out.println("Speed rightnow is :" + speed + " km/h");
      this.instruction(name);
    } else {
      System.out.println("Car is stopping now");
      this.instruction(name);
    }
  }

  //---------Method for checking Vehicle position---------
  public void locate() {
    if (position >= road) {
      System.out.println(name + " has reaching goal!");
    } else {
      System.out.println(name + "'s position is " + position + " km");
    }
  }
}
