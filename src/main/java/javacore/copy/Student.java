package javacore.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student implements Cloneable {
  private String name;
  private int age;
  private Major major;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Student student = (Student) super.clone();
    student.major = (Major) major.clone();
    return student;
  }
}
