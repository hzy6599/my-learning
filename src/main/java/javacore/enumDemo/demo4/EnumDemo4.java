package javacore.enumDemo.demo4;

public class EnumDemo4 {

  public static void main(String[] args) {
    singletonDesignPatternDemo();
    strategyDesignPatternDemo();
  }

  private static void singletonDesignPatternDemo() {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println("Singleton s1 equals singleton s2: " + s1.equals(s2));
  }

  private static void strategyDesignPatternDemo() {
    Double a = 6.0;
    Double b = 3.0;
    System.out.println("Two double numbers are: 6.0, 3.0");
    System.out.println("Execute Addition: " + Calculator.ADDITION.execute(a, b));
    System.out.println("Execute Subtraction: " + Calculator.SUBTRACTION.execute(a, b));
    System.out.println("Execute Multiplication: " + Calculator.MULTIPLICATION.execute(a, b));
    System.out.println("Execute Division: " + Calculator.DIVISION.execute(a, b));
  }
}
