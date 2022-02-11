package leetcode.q1_q100;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q83Test {

  Q83 question = new Q83();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethod(ListNode input, ListNode expectedResult) {
    ListNode actualResult = question.deleteDuplicates(input);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,1,2}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,1,2,3,3}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,3})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,3,3,3}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,3})
        )
    );
  }

}
