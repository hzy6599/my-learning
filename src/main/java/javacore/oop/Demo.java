package javacore.oop;

import javacore.oop.traffic.animal.Donkey;
import javacore.oop.traffic.car.Honda;
import javacore.oop.traffic.car.Mazda;
import javacore.oop.traffic.car.Toyota;
import javacore.oop.driver.Driver;

public class Demo {

  public static void main(String[] args) {
    Mazda mazda = new Mazda();
    Toyota toyota = new Toyota();
    Honda honda = new Honda();
    Donkey donkey = new Donkey();

    Driver myDriver = new Driver();

    myDriver.drive(mazda);
    myDriver.drive(toyota);
    myDriver.drive(honda);
    myDriver.drive(donkey);
  }

}
