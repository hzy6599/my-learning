package javacore.enumDemo.demo3;

public class EnumDemo3 {

  public static void main(String[] args) {
    String result = exampleIfElse("MELEE_UNIT");
    System.out.println(result);
    String result2 = exampleWithEnum("MELEE_UNIT");
    System.out.println(result2);
  }

  /**
   * The method takes unit type as String input and return the description.
   * As we add more category into the unitType we need to expand the if statement.
   * This is not efficient, unit testing also need revise.
   */
  private static String exampleIfElse(String unitType) {
    String result = "";
    if (unitType.equals("MELEE_UNIT")) {
      result = "Unit fights on front-line";
    } else if (unitType.equals("SIEGE_UNIT")) {
      result = "Unit fire at long range";
    } else if (unitType.equals("RANGED_UNIT")) {
      result = "Unit fight from distance";
    } else {
      result = "Unknown Unit Type";
    }
    return result;
  }

  private static String exampleWithEnum(String unitType) {
    return UnitType.valueOf(unitType).description();
  }

}
