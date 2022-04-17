package javacore.serialization.demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo2 {

  public static void main(String[] args) {
    try {
      serialize();
      Singleton deserializedSingleton = deserialize();
      Singleton localSingleton = Singleton.getInstance();
      System.out.println(deserializedSingleton == localSingleton);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void serialize() throws IOException {
    ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(
            new FileOutputStream("src/main/resources/singleton.txt"));
    objectOutputStream.writeObject(Singleton.getInstance());
    objectOutputStream.close();
  }

  private static Singleton deserialize() throws IOException, ClassNotFoundException {
    ObjectInputStream objectInputStream =
        new ObjectInputStream(
            new FileInputStream("src/main/resources/singleton.txt"));
    Singleton singleton = (Singleton) objectInputStream.readObject();
    objectInputStream.close();
    return singleton;
  }
}
