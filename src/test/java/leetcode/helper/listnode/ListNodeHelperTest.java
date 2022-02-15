package leetcode.helper.listnode;

import leetcode.definition.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ListNodeHelperTest {

  @ParameterizedTest
  @MethodSource("dataForBuildListNodeWithIntArray")
  public void testBuildListNodeWithIntArray(int[] input, int[] expectedValue) {
    ListNode node = ListNodeHelper.buildListNode(input);
    for (int expectedNumber: expectedValue) {
      Assertions.assertEquals(expectedNumber, node.val);
      node = node.next;
    }
  }

  @ParameterizedTest
  @MethodSource("dataForCompareListNodes")
  public void testCompareListNodes(ListNode l1, ListNode l2, boolean expectedResult) {
    Assertions.assertEquals(expectedResult, ListNodeHelper.compareListNodes(l1, l2));
  }

  public static Stream<Arguments> dataForBuildListNodeWithIntArray() {
    return Stream.of(
        Arguments.of(new int[] {1,2,3,4,5}, new int[] {1,2,3,4,5})
    );
  }

  public static Stream<Arguments> dataForCompareListNodes() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNode(new int[] {1,2,3,4,5}),
            ListNodeHelper.buildListNode(new int[] {1,2,3,4,5}),
            true
        ),
        Arguments.of(
            ListNodeHelper.buildListNode(new int[] {1,2,3,4,5}),
            ListNodeHelper.buildListNode(new int[] {1,2,3,4,4}),
            false
        )
    );
  }

}
