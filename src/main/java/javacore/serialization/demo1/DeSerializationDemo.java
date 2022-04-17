package javacore.serialization.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

  public static void main(String[] args) {
    File file = new File("src/main/resources/student.txt");
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Student student = (Student) objectInputStream.readObject();
      objectInputStream.close();

      System.out.println(student);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
