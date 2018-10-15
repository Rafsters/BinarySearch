# BinarySearch using divide and conquer algorithm



#### 1. Generate array of random integers

#### 2. Sort array using Java's quick sort

#### 3. Search for given element in generated sorted array using divide and conquer algorithm 

#### 4. If element is present in array point its location 

### Example

#### Binary search for element 6 in sorted array of 15 integers 

##### Generated random array:

67 16 43 80 6 70 27 17 81 61 68 19 84 25 5

##### Sorting array using java's quick sort (Quick sort uses divide and conquer approach as well)

5 6 16 17 19 25 27 43 61 67 68 70 80 81 84 

##### Binary search:

##### Middle element (value: 43, index 7) of sorted array is compared to given element (value: 6), if elements are equal algorithm returns index of the middle element

##### Middle element is not equal, so algorithm checks if middle element (value: 43) is greater than given element (value: 6)

##### Given element is not greater than middle element, so the other half is ignored
5 6 16 17 19 25 27 43 61 67 68 70 80 81 84 ==> 5 6 16 17 19 25 27

##### Middle element (value: 17, index 3) is greater than given element (value: 6)
5 6 16 17 19 25 27 ==> 5 6 16

##### Middle element (value: 6, index 1) is equal to given element (value: 6)
