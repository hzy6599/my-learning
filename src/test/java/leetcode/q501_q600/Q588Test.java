package leetcode.q501_q600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Q588Test {

  @Test
  public void test() {
    Q588 fileSystem = new Q588();
    List<String> files = fileSystem.ls("/");
    Assertions.assertTrue(files.size() == 0);
    fileSystem.mkdir("a/b/c");
    fileSystem.addContentToFile("a/b/c/d", "hello");
    files = fileSystem.ls("/");
    Assertions.assertTrue(files.size() == 1);
    String content = fileSystem.readContentFromFile("a/b/c/d");
    Assertions.assertEquals("hello", content);
  }

}
