import java.util.Scanner;

public class Car extends Vehicle {

  int seat;
  int maxseat;

  Car() {}

  Car(String name) {
    super(name);
    maxspeed = 150;
    seat = 0;
    maxseat = 10;
  }

  //---------Method to give instructions---------
  @Override
  public void instruction(String name) {
    System.out.println(
      name +
      " is waiting for your instructions: \n 1.Move\n 2.Speed Up\n 3.Speed Down\n 4.Check Position\n 5.Give Ride\n 6.Get off\n 7.Check passengers"
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
      case 5:
        this.giveride();
        this.instruction(name);
        break;
      case 6:
        this.getoff();
        this.instruction(name);
        break;
      case 7:
        this.checkpassengers();
        this.instruction(name);
        break;
      default:
        System.out.println("Unidentified Input");
        this.instruction(name);
        break;
    }
    scanner.close();
  }

  //---------Method to load people---------
  public void giveride() {
    if (seat < maxseat) {
      seat++;
    } else {
      System.out.println("The car is fulled");
    }
  }

  //---------Method to let people get off---------
  public void getoff() {
    if (seat > 0) {
      seat--;
    } else {
      System.out.println("The car is empty");
    }
  }

  //---------Method to check people nember---------
  public void checkpassengers() {
    System.out.println(seat + " people is in the car");
  }
}
