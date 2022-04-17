package javacore.enumDemo.demo2;

public class EnumDemo2 {

  public static void main(String[] args) {
    UserRole role1 = UserRole.ROLE_ROOT_ADMIN;
    UserRole role2 = UserRole.ROLE_ORDER_ADMIN;
    UserRole role3 = UserRole.ROLE_NORMAL;

    for (UserRole role : UserRole.values()) {
      System.out.println(role);
    }

    System.out.println(role1.ordinal());
    System.out.println(role2.ordinal());
    System.out.println(role3.ordinal());

    System.out.println(role1.compareTo(role2));
    System.out.println(role1.compareTo(role3));
    System.out.println(role2.compareTo(role3));

    System.out.println(role1.name());
    System.out.println(role2.name());
    System.out.println(role3.name());

    System.out.println(UserRole.valueOf("ROLE_ROOT_ADMIN"));
    System.out.println(UserRole.valueOf("ROLE_ORDER_ADMIN"));
    System.out.println(UserRole.valueOf("ROLE_NORMAL"));
  }

}
