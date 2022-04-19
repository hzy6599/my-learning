package javacore.map.hashmap;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 5, time = 3)
@Fork(1)
@State(Scope.Thread)
public class HashMapDemo {

  static Map<Integer, String> map = new HashMap() {{
    for (int i = 0; i < 10; i++) {
      put(i, "val: " + i);
    }
  }};

  /**
   * This demo shows different way to iterate through HashMap.
   */
  public static void main(String[] args) throws RunnerException {
    Options options = new OptionsBuilder()
                          .include(HashMapDemo.class.getSimpleName())
                          .output("src/main/resources/jmh-map.log")
                          .build();
    new Runner(options).run();
  }

  @Benchmark
  public static void useEntrySet() {
    Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();
      System.out.print(entry.getKey() +": ");
      System.out.print(entry.getValue() + "; ");
    }
    System.out.println();
  }

  @Benchmark
  public static void useKeySet() {
    Iterator<Integer> iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
      Integer key = iterator.next();
      System.out.print(key + ": ");
      System.out.print(map.get(key) + "; ");
    }
    System.out.println();
  }

  @Benchmark
  public static void useForEachEntrySet() {
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.print(entry.getKey() + ": ");
      System.out.print(entry.getValue() + "; ");
    }
    System.out.println();
  }

  @Benchmark
  public static void useForEachKeySet() {
    for (Integer key : map.keySet()) {
      System.out.print(key + ": ");
      System.out.print(map.get(key) + "; ");
    }
    System.out.println();
  }

  @Benchmark
  public static void useLambda() {
    map.forEach((key, value) -> {
      System.out.print(key + ": ");
      System.out.print(map.get(key) + "; ");
    });
    System.out.println();
  }

  @Benchmark
  public static void streamSingleThread() {
    map.entrySet().stream().forEach((entry) -> {
      System.out.print(entry.getKey() + ": ");
      System.out.print(entry.getValue() + "; ");
    });
    System.out.println();
  }

  @Benchmark
  public static void streamMultiThread() {
    map.entrySet().parallelStream().forEach((entry) -> {
      System.out.print(entry.getKey() + ": ");
      System.out.print(entry.getValue() + "; ");
    });
    System.out.println();
  }
}
