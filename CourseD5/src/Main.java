import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Choose vehicle type: \n 1.Car\n 2.Truck\n 3.Random");
    Scanner scanner = new Scanner(System.in);
    int cartype = scanner.nextInt();
    switch (cartype) {
      case 1:
        System.out.println("Name your car: ");
        Scanner name1 = new Scanner(System.in);
        String s1 = name1.next();
        Car v1 = new Car(s1);
        break;
      case 2:
        System.out.println("Name your car: ");
        Scanner name2 = new Scanner(System.in);
        String s2 = name2.next();
        Truck v2 = new Truck(s2);
        break;
      case 3:
        System.out.println("Name your car: ");
        Scanner name3 = new Scanner(System.in);
        String s3 = name3.next();
        Vehicle v3 = new Vehicle(s3);
        break;
      default:
        System.out.println("Unidentified Input");
        break;
    }
  }
}
