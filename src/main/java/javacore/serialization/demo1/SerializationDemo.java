package javacore.serialization.demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Landon");
    student.setAge(18);
    student.setScore(101);

    try {
      File file = new File("src/main/resources/student.txt");
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(student);
      objectOutputStream.close();
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

}
