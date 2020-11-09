High-pass pseudocode:

```
highPass(node, value):
    if (node.data > value):
        // run high pass on the left subtree
    else if (node.data < value):
        // run high pass on right subtree and remove the current node
    else:
        // node.data is equal to value
        // remove the left subtree
```