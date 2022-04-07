package leetcode.q701_q800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q721Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(List<List<String>> accounts, int expectedAccount) {
    List<List<String>> combinedAccounts = Q721.accountsMerge(accounts);
    Assertions.assertEquals(expectedAccount, combinedAccounts.size());
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            Arrays.asList(
                Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com"),
                Arrays.asList("John","johnsmith@mail.com","john00@mail.com"),
                Arrays.asList("Mary","mary@mail.com"),
                Arrays.asList("John","johnnybravo@mail.com")),
            3),
        Arguments.of(Arrays.asList(
                Arrays.asList("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"),
                Arrays.asList("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"),
                Arrays.asList("Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"),
                Arrays.asList("Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"),
                Arrays.asList("Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co")),
            5));
  }

}
