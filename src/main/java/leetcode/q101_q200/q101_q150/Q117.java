package leetcode.q101_q200.q101_q150;

import leetcode.definition.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Q117 {

  public Node connectLinearSpace(Node root) {
    if (root == null) {
      return null;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    Node prev;

    while (!queue.isEmpty()) {
      int size = queue.size();
      prev = null;
      for (int i = 0; i < size; i++) {
        Node curr = queue.poll();
        curr.next = prev;
        prev = curr;
        if (curr.right != null) {
          queue.offer(curr.right);
        }
        if (curr.left != null) {
          queue.offer(curr.left);
        }
      }
    }

    return root;
  }

  public Node connectRecursive(Node root) {
    if (root == null) {
      return null;
    }

    if (root.right != null) {
      root.right.next = findNext(root);
      connectRecursive(root.right);
    }

    if (root.left != null) {
      if (root.right != null) {
        root.left.next = root.right;
      } else {
        root.left.next = findNext(root);
      }
      connectRecursive(root.left);
    }

    return root;
  }

  private Node findNext(Node root) {
    while (root.next != null) {
      root = root.next;
      if (root.left != null) {
        return root.left;
      }
      if (root.right != null) {
        return root.right;
      }
    }
    return null;
  }

  public Node connectConstantSpace(Node root) {
    Node curr = root;
    Node head = null;
    Node prev = null;

    while (curr != null) {
      if (curr.left != null) {
        if (prev != null) {
          prev.next = curr.left;
        } else {
          head = curr.left;
        }
        prev = curr.left;
      }

      if (curr.right != null) {
        if (prev != null) {
          prev.next = curr.right;
        } else {
          head = curr.right;
        }
        prev = curr.right;
      }

      if (curr.next != null) {
        curr = curr.next;
      } else {
        curr = head;
        head = null;
        prev = null;
      }
    }

    return root;
  }

}
