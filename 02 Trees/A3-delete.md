Remove pseudocode:

```
delete(node, value):
    if (node.data > value):
        // recurse left
        // calling updateLeft
    else if (node.data < value):
        // recurse right
        // calling updateRight
    else:
        // found
        if no children:
            // return null
        if 1 child:
            // return child
        else 2 children:
            merge(node.left, node.right)

merge(one, two):
    // if one is null, return two
    // otherwise, replace one's right child
       // with merging the right child and two
```