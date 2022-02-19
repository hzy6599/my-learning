package leetcode.q101_q200;

import leetcode.definition.Node;
import leetcode.helper.node.NodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q117Test {

  Q117 q117 = new Q117();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithLinearSpace(Node root, Node expected) {
    Node actual = q117.connectLinearSpace(root);
    Assertions.assertTrue(NodeHelper.compareNodes(expected, actual));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithRecursive(Node root, Node expected) {
    Node actual = q117.connectRecursive(root);
    Assertions.assertTrue(NodeHelper.compareNodes(expected, actual));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithConstantSpace(Node root, Node expected) {
    Node actual = q117.connectConstantSpace(root);
    Assertions.assertTrue(NodeHelper.compareNodes(expected, actual));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(buildNodeOne(), buildOutputOne()),
        Arguments.of(null, null)
    );
  }

  private static Node buildNodeOne() {
    Node node6 = new Node(7);
    Node node5 = new Node(5);
    Node node4 = new Node(4);
    Node node3 = new Node(3, null, node6 ,null);
    Node node2 = new Node(2, node4, node5, null);
    Node node1 = new Node(1, node2, node3, null);

    return node1;
  }

  private static Node buildOutputOne() {
    Node node6 = new Node(7);
    Node node5 = new Node(5, null, null, node6);
    Node node4 = new Node(4, null, null, node5);
    Node node3 = new Node(3, null, node6 ,null);
    Node node2 = new Node(2, node4, node5, node3);
    Node node1 = new Node(1, node2, node3, null);

    return node1;
  }

}
