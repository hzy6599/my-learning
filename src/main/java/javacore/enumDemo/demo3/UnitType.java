package javacore.enumDemo.demo3;

public enum UnitType implements UnitDescription{

  MELEE_UNIT {
    @Override
    public String description() {
      return "MELEE_UNIT: " + "Unit fights on front-line";
    }
  },
  RANGED_UNIT {
    @Override
    public String description() {
      return "RANGED_UNIT: " + "Unit fight from distance";
    }
  },
  SIEGE_UNIT {
    @Override
    public String description() {
      return "SIEGE_UNIT: " + "Unit fire at long range";
    }
  };

}
