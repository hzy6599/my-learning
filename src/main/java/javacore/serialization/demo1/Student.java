package javacore.serialization.demo1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Student implements Serializable {

  private String name;
  private Integer age;
  private Integer score;
  private transient Integer password;

  private void readObject(ObjectInputStream objectInputStream)
      throws IOException, ClassNotFoundException {
    objectInputStream.defaultReadObject();

    if ((score < 0) || (score > 100)) {
      throw new IllegalArgumentException("Score must be between 0 ~ 100.");
    }
  }

}
