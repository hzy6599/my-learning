package leetcode.helper.node;

import leetcode.definition.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NodeHelperTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(Node n1, Node n2, boolean expected) {
    boolean actual = NodeHelper.compareNodes(n1, n2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(buildNodeOne(), buildNodeOne(), true),
        Arguments.of(null, null, true),
        Arguments.of(buildNodeOne(), null, false)
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

}
