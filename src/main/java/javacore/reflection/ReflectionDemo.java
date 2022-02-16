package javacore.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

  private static final String CLASS_NAME = "javacore.reflection.TargetObject";
  private static final String PUBLIC_METHOD = "publicMethod";
  private static final String PRIVATE_METHOD = "privateMethod";
  private static final String VALUE = "value";

  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
                 NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
    /**
     * Get Class type, with class type object we can do:
     * 1. Create new instance.
     * 2. Get all methods.
     * 3. Acquire the method and invoke it.
     * 4. Acquire parameter and modify.
     */
    Class<?> targetClass = Class.forName(CLASS_NAME);

    /**
     * 1. Create new instance.
     */
    TargetObject targetObject = (TargetObject) targetClass.newInstance();

    /**
     * 2. Get all methods.
     */
    Method[] methods = targetClass.getDeclaredMethods();
    for (Method method: methods) {
      System.out.println(method.getName());
    }

    /**
     * 3. Acquire the method and invoke it.
     */
    Method publicMethod = targetClass.getDeclaredMethod(PUBLIC_METHOD, String.class);
    publicMethod.invoke(targetObject, "demo String");

    Method privateMethod = targetClass.getDeclaredMethod(PRIVATE_METHOD);
    // To invoke private method we need to disable security check
    privateMethod.setAccessible(true);
    privateMethod.invoke(targetObject);

    /**
     * 4. Acquire parameter and modify.
     */
    Field field = targetClass.getDeclaredField(VALUE);
    // To modify private field we need to disable security check
    field.setAccessible(true);
    field.set(targetObject, "new Field value");
    privateMethod.invoke(targetObject);
  }

}
