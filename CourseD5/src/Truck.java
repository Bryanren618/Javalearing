import java.util.Scanner;

public class Truck extends Vehicle {

  double load;
  double payload;

  Truck() {}

  Truck(String name) {
    super(name);
    maxspeed = 90;
    load = 0;
    payload = 1000;
  }

  //---------Method to give instructions---------
  public void instruction(String name) {
    System.out.println(
      name +
      " is waiting for your instructions: \n 1.Move\n 2.Speed Up\n 3.Speed Down\n 4.Check Position\n 5.Loading Cargo\n 6.Unloading\n 7.Check Payload"
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
        this.load();
        this.instruction(name);
        break;
      case 6:
        this.unload();
        this.instruction(name);
        break;
      case 7:
        this.checkpayload();
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
  public void load() {
    if (load < payload) {
      load += 100;
    } else {
      System.out.println("The truck is fulled");
    }
  }

  //---------Method to let people get off---------
  public void unload() {
    if (load > 0) {
      load -= 100;
    } else {
      System.out.println("The truck is empty");
    }
  }

  //---------Method to check payload---------
  public void checkpayload() {
    System.out.println(load + " ton now");
  }
}
