Heapsort Code:

```java
void heapSort(int[] arr) {
    // one past the end of the heap
    // any one item is a valid heap
    int heapEnd = 1;

    // add all items to the help
    while (heapEnd < arr.length) {
        // add next item as leaf
        heapEnd++;

        percolateUp(arr, heapEnd);
    }

    // remove all items from the heap
    while (heapEnd > 0) {
        // remove the root and swap with the last leaf
        heapEnd--;
        swap(arr, 0, heapEnd);

        percolateDown(arr, heapEnd);
    }
}

void percolateUp(int[] arr, int heapEnd) {
    int currentIndex = heapEnd - 1;
    int parentIndex = (currentIndex - 1) / 2;

    while (currentIndex > 0 && arr[currentIndex] > arr[parentIndex]) {
        swap(arr, currentIndex, parentIndex);
        currentIndex = parentIndex;

        parentIndex = (currentIndex - 1) / 2;
    }
}

void percolateDown(int[] arr, int heapEnd) {
    int currentIndex = 0;
    int leftChildIndex = 1;
    int rightChildIndex = 2;

    while (leftChildIndex < heapEnd && arr[leftChildIndex] > arr[currentIndex]
        || rightChildIndex < heapEnd && arr[rightChildIndex] > arr[currentIndex]) {

        if (rightChildIndex < heapEnd && arr[rightChildIndex] > arr[leftChildIndex]) {
            // swap with right child
            swap(arr, currentIndex, rightChildIndex);
            currentIndex = rightChildIndex;
        } else {
            // swap with left child
            swap(arr, currentIndex, leftChildIndex);
            currentIndex = leftChildIndex;
        }

        leftChildIndex = (currentIndex * 2) + 1;
        rightChildIndex = (currentIndex * 2) + 2;
    }
}
```