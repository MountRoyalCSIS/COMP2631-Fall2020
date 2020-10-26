Assignment 3 node class:

```java
pulic class TreeNode {

    private final TreeNode left;
    private final TreeNode right;
    private final double data;
    private final int size;

    public TreeNode(double newData) {
        left = null;
        right = null;
        data = newData;
        size = 1;
    }

    private TreeNode(TreeNode newLeft, TreeNode newRight, double newData) {
        left = newLeft;
        right = newRight;
        data = newData;
        // option 1: ternary
        size = 1
            + newLeft == null ? 0 : newLeft.size
            + newRight == null ? 0 : newRight.size;
        // option 2: ifs
        int newSize = 1;
        if (newLeft != null) {
            newSize += newLeft.size;
        }
        if (newRight != null) {
            newSize += newRight.size;
        }
        size = newSize;
    }

    public TreeNode updateLeft(TreeNode newLeft) {
        if (newLeft == this.left) {
            return this;
        } else {
            return new TreeNode(newLeft, this.right, this.newData);
        }
    }

}
```