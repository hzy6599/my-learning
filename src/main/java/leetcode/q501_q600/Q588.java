package leetcode.q501_q600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q588 {

  class Directory {
    Map<String, Directory> directories = new HashMap<>();
    Map<String, String> files = new HashMap<>();
  }

  Directory root;

  public Q588() {
    root = new Directory();
  }

  public List<String> ls(String path) {
    Directory d = root;
    List<String> files = new ArrayList<>();

    if (!path.equals("/")) {
      String[] paths = path.split("/");
      for (int i = 1; i < paths.length - 1; i++) {
        d = d.directories.get(paths[i]);
      }
      if (d.files.containsKey(paths[paths.length - 1])) {
        files.add(paths[paths.length - 1]);
        return files;
      } else {
        d = d.directories.get(paths[paths.length - 1]);
      }
    }

    files.addAll(new ArrayList<>(d.directories.keySet()));
    files.addAll(new ArrayList<>(d.files.keySet()));
    Collections.sort(files);

    return files;
  }

  public void mkdir(String path) {
    Directory d = root;
    String[] paths = path.split("/");
    for (int i = 1; i < paths.length; i++) {
      String currPath = paths[i];
      if (!d.directories.containsKey(currPath)) {
        d.directories.put(currPath, new Directory());
      }
      d = d.directories.get(currPath);
    }
  }

  public void addContentToFile(String filePath, String content) {
    Directory d = root;
    String[] paths = filePath.split("/");
    for (int i = 1; i < paths.length - 1; i++) {
      d = d.directories.get(paths[i]);
    }
    d.files.put(paths[paths.length - 1], d.files.getOrDefault(paths[paths.length - 1], "") + content);
  }

  public String readContentFromFile(String filePath) {
    Directory d = root;
    String[] paths = filePath.split("/");
    for (int i = 1; i < paths.length - 1; i++) {
      d = d.directories.get(paths[i]);
    }
    return d.files.get(paths[paths.length - 1]);
  }

}
