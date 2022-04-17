package javacore.enumDemo.demo5;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public class EnumDemo5 {

  private static EnumSet<UnitType> rangedAttackUnitTypes = EnumSet.of(
      UnitType.RANGED_UNIT,
      UnitType.SIEGE_UNIT);

  private static Map<UnitType, Integer> unitMap = new EnumMap<>(UnitType.class);

  public static void main(String[] args) {
    example1();
    example2();
  }

  private static void example1() {
    Unit dragoon = new Dragoon();
    System.out.println("Dragoon is ranged attack unit: " + isRangedAttack(dragoon));
  }

  private static boolean isRangedAttack(Unit unit) {
    return rangedAttackUnitTypes.contains(unit.getUnitType());
  }

  private static void example2() {
    List<Unit> units = Arrays.asList(
        new Dragoon(),
        new Dragoon(),
        new Colossus(),
        new Dragoon(),
        new Dragoon(),
        new Colossus(),
        new Dragoon());

    for (Unit unit : units) {
      unitMap.put(unit.getUnitType(), unitMap.getOrDefault(unit.getUnitType(), 0) + 1);
    }

    for (UnitType unitType : unitMap.keySet()) {
      System.out.println(unitType + ": " + unitMap.get(unitType));
    }
  }
}
