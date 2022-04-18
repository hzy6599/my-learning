package javacore.functionalInterface;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class OptionalDemo {

  @Getter
  @Setter
  class Student {
    private String name;
    private Subject subject;
  }

  @Getter
  @Setter
  class Subject {
    private String subjectName;
    private Integer score;
  }

  public static void main(String[] args) {
    Integer score = getScoreWithNullCheck(null);
    Integer score2 = getScoreWithOptional(null);
    System.out.println(score);
    System.out.println(score2);
  }

  private static Integer getScoreWithNullCheck(Student student) {
    if (student != null) {
      Subject subject = student.getSubject();
      if (subject != null) {
        return subject.getScore();
      }
    }
    return null;
  }

  private static Integer getScoreWithOptional(Student student) {
    Integer score = Optional.ofNullable(student)
                        .map(Student::getSubject)
                        .map(Subject::getScore)
                        .orElse(null);
    return score;
  }

}
