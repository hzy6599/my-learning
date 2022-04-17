package javacore.enumDemo.demo4;

public enum Calculator {

  ADDITION {
    public Double execute(Double x, Double y) {
      return x + y;
    }
  },
  SUBTRACTION {
    public Double execute(Double x, Double y) {
      return x - y;
    }
  },
  MULTIPLICATION {
    public Double execute(Double x, Double y) {
      return x * y;
    }
  },
  DIVISION {
    public Double execute(Double x, Double y) {
      return x / y;
    }
  };

  public abstract Double execute(Double x, Double y);
}
