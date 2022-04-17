package javacore.enumDemo.demo2;

public enum UserRoleV2 {
  ROLE_ROOT_ADMIN("System Manager", 000000),
  ROLE_ORDER_ADMIN("Order Manager", 000001),
  ROLE_NORMAL("User", 000002);

  private final String roleName;
  private final Integer roleCode;

  UserRoleV2(String roleName, Integer roleCode) {
    this.roleName = roleName;
    this.roleCode = roleCode;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public Integer getRoleCode() {
    return this.roleCode;
  }

  public static Integer getRoleCodeByRoleName(String roleName) {
    for (UserRoleV2 userRoleEnum : UserRoleV2.values()) {
      if (userRoleEnum.getRoleName().equals(roleName)) {
        return userRoleEnum.getRoleCode();
      }
    }
    return null;
  }
}
