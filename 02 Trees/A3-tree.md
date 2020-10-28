Assignment 3 tree class:

```java
pulic class MyTree implements ImmutableSortedSet {

    private final TreeNode root;

    public MyTree() {
        this.root = null;
    }

    private MyTree(TreeNode newRoot) {
        this.root = newRoot;
    }

    public MyTree add(double value) {
        TreeNode newRoot = add(this.root, value);

        // Option 1: using if-else
        if (newRoot == this.root) {
            return this
        } else {
            return new MyTree(newRoot);
        }

        // Option 2: using ternary
        return newRoot == this.root ? this : new MyTree(newRoot);
    }

    // TODO recursive add

}
```