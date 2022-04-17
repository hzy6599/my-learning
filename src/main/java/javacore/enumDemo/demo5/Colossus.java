package javacore.enumDemo.demo5;

public class Colossus implements Unit{
  @Override
  public UnitType getUnitType() {
    return UnitType.SIEGE_UNIT;
  }
}
