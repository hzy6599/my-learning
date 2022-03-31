package leetcode.helper.arraylist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ArrayListHelper {

  public static final Comparator<List<Integer>> compareRule;

  static {
    compareRule = (o1, o2) -> {
      int index = 0;
      while (Objects.equals(o1.get(index), o2.get(index))) {
        if (index < o1.size() - 1) {
          index++;
        } else {
          break;
        }
      }
      return o1.get(index) - o2.get(index);
    };
  }

  public static void sort2DArrayList(List<List<Integer>> arrayList) {
    for (List<Integer> array: arrayList) {
      Collections.sort(array);
    }
    arrayList.sort(compareRule);
  }

  public static boolean compareArrayList(List<Integer> l1, List<Integer> l2) {
    if (l1.size() != l2.size()) {
      return false;
    }
    Collections.sort(l1);
    Collections.sort(l2);
    for (int i = 0; i < l1.size(); i++) {
      if (!Objects.equals(l1.get(i), l2.get(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean compare2DArrayList(List<List<Integer>> l1, List<List<Integer>> l2) {
    if (l1.size() != l2.size()) {
      return false;
    }
    l1.sort(compareRule);
    l2.sort(compareRule);

    for (int i = 0; i < l1.size(); i++) {
      if (!compareArrayList(l1.get(i), l2.get(i))) {
        return false;
      }
    }
    return true;
  }

}
