package javacore.serialization.demo2;

import java.io.Serializable;

public class Singleton implements Serializable {

  private Singleton() {}

  private static class SingletonHolder {
    private static final Singleton singleton = new Singleton();
  }

  public static synchronized Singleton getInstance() {
    return SingletonHolder.singleton;
  }

  private Object readResolve() {
    return SingletonHolder.singleton;
  }
}
