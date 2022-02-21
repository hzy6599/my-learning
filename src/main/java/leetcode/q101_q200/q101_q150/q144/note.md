# Solution
Preorder tree traversal use following pattern:
1. Traverse current node
2. Traverse left child of the current node
3. Traverse right child of the currennt node
Given the idea there are two solutions.

## No.1 Recursion
Define a helper method to implement recursion.
### Complexity
Time complexity: O(n)
- Time complexity follow recursive function T(n) = 2 * T(n/2) + 1

Space complexity: O(n)
- Worst space complexity is O(n) when a tree is leaning towards one side. 
Average case it's O(logn) where we have balanced binary tree.

## No.2 Iteration
Use stack to help traverse the tree. If tree size is very large, this method
can help avoid stack overflow issue.
Time complexity: O(n)
Space complexity: O(n)
