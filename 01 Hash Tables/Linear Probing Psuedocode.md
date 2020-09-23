## Hash Table Linear Probing Pseudocode

Search Function:
- Let `SIZE` be the table size
- Hash the key to find the hash value `h`
- Start with offset called `i` of zero
- While `i < SIZE` (we haven't checked all buckets):
  - Check at position `(h + i) % SIZE` for the key
  - If we find an empty bucket
    - If we have no saved position for adding
        - Remember this position for adding
    - Return: "not found" and position for adding
  - If bucket not deleted and the key is found
    - Return bucket position
  - If the bucket is deleted and we have no saved position for adding
    - Remember this position for adding
  - If not found, set `i` to `i + 1`
- Return "table full"

Find Operation:
- Call the search funtion
- If "not found" or "table full", return "not found"
- Otherwise, return "found"
  - If we are using the hash table as a map, we could return the value here

Add Operation:
- Call the search function
- If found, do nothing
  - If we are using the hash table as a map, we could update the value here
- If "not found"
  - Add the value to the empty bucket returned from the search function
- If "table full"
  - Throw an exception _or_ resize the table and start over

Remove Operation:
- Call the search function
- If "not found" or "table full", do nothing
- If found
  - Set the bucket to "deleted"
  - Optionally clear key (and value for map)
