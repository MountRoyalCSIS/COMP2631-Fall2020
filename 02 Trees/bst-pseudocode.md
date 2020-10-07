Find in BST:

- Set the current node to the root
- While not found and not null:
  - If the current node is the value we want
    - Return "found" (or set found to true)
  - Otherwise, if the curent node is greater than the value
    - Set current to the left child of current
  - Otherwise (the curent node must be less than the value)
    - Set current to the right child of current

```java
public boolean contains(int value) {
    TreeNode current = this.root;
    boolean found = false;

    while (current != null && !found) {
        if (current.getData() == value) {
            found = true;
        } else if (current.getData() > value) {
            current = current.getLeft();
        } else {
            current = current.getRight();
        }
    }

    return found;
}

public boolean contains2(int value) {
    return contains(this.root, value);
}

private boolean contains(TreeNode current, int value) {
    if (current == null) {
        return false;
    } else if (current.getData() == value) {
        return true;
    } else if (current.getData() > value) {
        return contains(current.getLeft(), value);
    } else {
        return contains(current.getRight(), value);
    }
}
```

Add to a BST:

- If the root is null
  - Create a new node
  - Set root to the new node
- Set current to the root node
- While not done
  - If the current node is the value we're adding
    - Set done to true as we don't want a duplicate
  - Otherwise, if the current node is greater than the value
    - If the left child of current is null
      - Create a new node
      - Set the left child of the current node to the new node
      - Set done to true
    - Otherwise (left child not null)
      - Set current to current's left child
  - Otherwise (the current node is less than the value)
    - If the right child of current is null
      - Create a new node
      - Set the right child of the current node to the new node
      - Set done to true
    - Otherwise (right child not null)
      - Set current to current's right child

```java
public void add(int value) {
    if (this.root == null) {
        this.root = new TreeNode(value);
    }

    TreeNode current = this.root;
    boolean done = false;

    while (!done) {
        if (current.getData() == value) {
            // don't add duplicates
            done = true;
        } else if (current.getData() > value) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode(value());
            } else {
                current = current.getLeft();
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(new TreeNode(value));
            } else {
                current = current.getRight();
            }
        }
    }
}
```

Recursive add to a BST:

- Base case(s):
    Node is null -> return a new node
    Value in node matches value to add -> return node
- General case(s):
    Value is less than the current node
        -> Set left child to result of adding to left child

    Value is greater than the current node
        -> Set right child to result of adding to right child

```java
public void add2(int value) {
    this.root = add(this.root, value);
}

private TreeNode add(TreeNode current, int value) {
    if (current == null) {
        return new TreeNode(value);
    } else if (current.getData() > value) {
        current.setLeft(add(current.getLeft(), value));
    } else if (current.getData() < value) {
        current.setRight(add(current.getRight(), value));
    }

    return current;
}
```