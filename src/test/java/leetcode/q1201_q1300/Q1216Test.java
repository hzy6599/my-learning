package leetcode.q1201_q1300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q1216Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDPTopDown(String string, int changesAllowed, boolean canBePalindrome) {
    boolean isPalindrome = Q1216.isValidPalindromeDPTopDown(string, changesAllowed);
    Assertions.assertEquals(canBePalindrome, isPalindrome);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDPBotUp2D(String string, int changesAllowed, boolean canBePalindrome) {
    boolean isPalindrome = Q1216.isValidPalindromeBottomUp2D(string, changesAllowed);
    Assertions.assertEquals(canBePalindrome, isPalindrome);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDPBotUp1D(String string, int changesAllowed, boolean canBePalindrome) {
    boolean isPalindrome = Q1216.isValidPalindromeBottomUp1D(string, changesAllowed);
    Assertions.assertEquals(canBePalindrome, isPalindrome);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("abcdeca", 2, true),
        Arguments.of("abbababa", 1, true),
        Arguments.of("fcgihcgeadfehgiabegbiahbeadbiafgcfchbcacedbificicihibaeehbffeidiaiighceegbfdggggcfaiibefbgeegbcgeadcfdfegfghebcfceiabiagehhibiheddbcgdebdcfegaiahibcfhheggbheebfdahgcfcahafecfehgcgdabbghddeadecidicchfgicbdbecibddfcgbiadiffcifiggigdeedbiiihfgehhdegcaffaggiidiifgfigfiaiicadceefbhicfhbcachacaeiefdcchegfbifhaeafdehicfgbecahidgdagigbhiffhcccdhfdbd",
            216,
            true)
    );
  }

}
