package javacore.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {
    Function<Integer, Integer> f1 = i -> i + i;
    Function<Integer, Integer> f2 = i -> i * i;
    Consumer c = System.out::println;

    c.accept(f1.andThen(f2).apply(2));
  }

}
