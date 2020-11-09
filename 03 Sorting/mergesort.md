Mergesort Code:

```java
void mergeSort(int[] arr) {
    mergeSort(arr, 0, arr.length);
}

// end is one past the last element
void mergeSort(int[] arr, int start, int end) {
    // int mid = start + (end - start) / 2;
    int mid = (start + end) / 2;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid, end);

    merge(arr, start, mid, end);
}

void merge(int[] arr, int start, int mid, int end) {
    int[] temp = new int[end - start];          // O(1)

    for(int i = 0; i < temp.length; i++) {      // O(n)
        temp[i] = arr[i + start];
    }

    int dest = start;
    int from1 = 0;
    int end1 = mid - start;                     // 5 = O(1)
    int from2 = end1;
    int end2 = end - start;

    while(from1 < end1 && from2 < end2) {       // 4*n = O(n)
        if (temp[from1] <= temp[from2]) {
            // take from from1
            arr[dest] = temp[from1];
            from1++;
        } else {
            // take from from2
            arr[dest] = temp[from2];
            from2++;
        }
        dest++;
    }

    while(from1 < end1) {                       // 3 * 0.5n = O(n)
        arr[dest] = temp[from1];
        from1++;
        dest++;
    }

    while(from2 < end2) {                       // 3 * 0.5n = O(n)
        arr[dest] = temp[from2];
        from2++;
        dest++;
    }
}
```