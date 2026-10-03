

import java.util.Scanner;

class DataTypes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vehicleNo = sc.nextInt();
    double waste = sc.nextDouble();
    int points = sc.nextInt();
    char status = sc.next().charAt(0);

    System.out.println("Vehicle Number:" + vehicleNo);
    System.out.println("Waste Collected (kg):" + waste);
    System.out.println("Collection Points:" + points);
    System.out.println("Vehicle Status:" + status);

    sc.close();
  }
}