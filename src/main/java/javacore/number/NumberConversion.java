package javacore.number;

public class NumberConversion {

  public static void main(String[] args) {
    // Problem we might encounter when using float/double for monetary system.
    example1();
    example2();
    example3();
    example4();
    /**
     * Conclusion: do not use float/double for money/currency calculation.
     * Alternative solution:
     * 1. Use String for comparison and calculation.
     * 2. Use BigInt class
     */
  }

  private static void example1() {
    System.out.println("1. Floating number has weird conversion condition: ");
    System.out.println(1f == 0.9999999f);  // Return false
    System.out.println(1f == 0.99999999f); // Return true
  }

  private static void example2() {
    System.out.println("2. Converting float to double will cause unexpected answer: ");
    float f = 1.1f;
    double d = (double) f;
    System.out.println(f);
    System.out.println(d);
  }

  private static void example3() {
    System.out.println("3. Arithmetic calculation give wrong answer: ");
    System.out.println(0.2 + 0.7);
  }

  private static void example4() {
    System.out.println("4. Number increment produce weird result: ");
    System.out.println("4.1. We start with f1 = 8455263f");
    float f1 = 8455263f;
    for (int i = 0; i < 10; i++) {
      System.out.println(f1);
      f1++;
    }
    System.out.println("4.2. We start with f2 = 84552631f");
    float f2 = 84552631f;
    for (int i = 0; i < 10; i++) {
      System.out.println(f2);
      f2++;
    }
  }
}
