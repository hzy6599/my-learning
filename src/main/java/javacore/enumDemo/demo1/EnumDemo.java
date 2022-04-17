package javacore.enumDemo.demo1;

public class EnumDemo {

  public static void main(String[] args) {
    exampleWithStaticVariable(0);
    exampleWithEnum(ItemStatus.FOR_AUCTION);
  }

  /**
   * This method take an int which represent item status.
   * It uses a switch block to check status and print information.
   * The problem with this implementation is that the input int is not restricted.
   * If we pass any value other than 0,1,2 we won't be able to catch it in compile time.
   */
  private static void exampleWithStaticVariable(int itemStatus) {
    switch (itemStatus) {
      case StaticItemStatus.FOR_SALE:
        System.out.println("Item is for sale now.");
        break;
      case StaticItemStatus.FOR_AUCTION:
        System.out.println("Item is auction.");
        break;
      case StaticItemStatus.SOLD:
        System.out.println("Item already sold.");
        break;
      default:
        System.out.println("Your input was wrong.");
    }
  }

  /**
   * This method is an improved version, it uses enum instead of static variables.
   * It forces us to pass in an enum type, so we are guaranteed the swtich statement will
   * cover all the cases.
   */
  private static void exampleWithEnum(ItemStatus itemStatus) {
    switch (itemStatus) {
      case FOR_SALE:
        System.out.println("Item is for sale now.");
        break;
      case FOR_AUCTION:
        System.out.println("Item is auction.");
        break;
      case SOLD:
        System.out.println("Item already sold.");
        break;
      default:
        System.out.println("Never reaches here");
    }
  }

}
