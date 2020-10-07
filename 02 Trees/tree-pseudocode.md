Height of a tree:

- For each child:
  - Find the height of the child, recursively
  - Take the largest height and add 1

```java
private int height(TreeNode node) {
    int maxHeight = 0;

    for (TreeNode child : node.getChildren()) {
        int childHeight = height(child);
        if (childHeight > maxHeight) {
            maxHeight = childHeight;
        }
    }

    return maxHeight + 1;
}

public int height() {
    return height(this.root);
}
```

Depth-first traversal of a tree:

e.g. Pre-order

- visit the root node
- do pre-order traversal of left subtree
- do pre-order traversal of right subtree

```java
private void preOrder(TreeNode node) {
    if (node == null) {
        return;
    }

    System.out.println(node.getData());
    preOrder(node.getLeft());
    preOrder(node.getRight());
}

public void preOrder() {
    return preOrder(this.root);
}
```