Quicksort Code:

```java
void quicksort(int[] arr) {
    quicksort(arr, 0, arr.length)
}

void quicksort(int[] arr, int start, int end) {
    if (end - start <= 1) {
        return;
    }

    int mid = partition(arr, start, end);

    quicksort(arr, start, mid);
    quicksort(arr, mid + 1, end);
}

void partition(int[] arr, int start, int end) {
    int pivot = end - 1;
    int low = start;                                        // 3 = O(1)
    int high = pivot - 1;

    while (low <= high) {          // up to n/2 times = naively O(n^2), really O(n)
        while (arr[low] < arr[pivot]) {                     // up to n = O(n)
            low++;
        }
        while (high >= start && arr[high] > arr[pivot]) {   // up to n = O(n)
            high--;
        }

        if (low < high) {                                   // 2 = O(1)
            swap(arr, low, high);
        }
    }

    swap(arr, low, pivot);                                  // O(1)

    return low;                                             // O(1)
}
```