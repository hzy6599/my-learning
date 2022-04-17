package javacore.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

  public static void main(String[] args) {
    regularWay();
    consumerWay();
  }

  private static void regularWay() {
    System.out.println("Hello World");
    System.out.println("This is a test");
    System.out.println("It uses regular method");
  }

  private static void consumerWay() {
    Consumer c = System.out::println;
    c.accept("Hello World");
    c.accept("This is another test");
    c.accept("It uses consumer");

    c.andThen(c).andThen(c).accept("Three times print;");
  }
}
