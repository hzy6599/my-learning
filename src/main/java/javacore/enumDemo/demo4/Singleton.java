package javacore.enumDemo.demo4;

public class Singleton {

  private Singleton() {}

  public enum SingletonEnum {
    INSTANCE;

    private Singleton singleton;

    SingletonEnum() {
      this.singleton = new Singleton();
    }

    public Singleton getInstance() {
      return this.singleton;
    }
  }

  public static Singleton getInstance() {
    return SingletonEnum.INSTANCE.getInstance();
  }

}
