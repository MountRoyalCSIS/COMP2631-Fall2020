Question 3: sum the nodes in a tree

- Base case(s):
    - if `current` is `null` -> sum is 0
- General case(s):
    - sum is `data` in `current` plus the sum of the left subtree plus the sum of the right subtree


```java
private static int sumTree (TreeNode current) {
    if (current == null) {
        return 0;
    }

    int sum = current.getData() + sumTree(current.getLeft()) + sumTree(current.getRight());

    return sum;
}

public int sum() {
    return sumTree(this.root);
}
```