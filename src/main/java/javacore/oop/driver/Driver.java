package javacore.oop.driver;

import javacore.oop.traffic.Vehicle;

public class Driver {
  public void drive(Vehicle vehicle) {
    System.out.println("Simple driver start working: ");
    vehicle.drive();
  }
}
