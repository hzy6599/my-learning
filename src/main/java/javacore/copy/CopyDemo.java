package javacore.copy;

public class CopyDemo {

  public static void main(String[] args) {
    try {
      example();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private static void example() throws CloneNotSupportedException {
    Major major = new Major("Math", 001L);
    Student student = new Student("Landon", 18, major);

    Student student2 = (Student) student.clone();
    student2.setName("JD");

    System.out.println(student == student2);
    System.out.println(student);
    System.out.println(student2);

    student.setAge(24);
    System.out.println(student);
    System.out.println(student2);

    student.getMajor().setMajorName("Biology");
    System.out.println(student);
    System.out.println(student2);
  }
}
