package javacore.reflection;

public class TargetObject {

  private String value;

  public TargetObject() {
    this.value = "Reflection EnumDemo";
  }

  public void publicMethod(String s) {
    System.out.println("From publicMethod: " + s);
  }

  private void privateMethod() {
    System.out.println("From privateMethod: " + this.value);
  }

}
