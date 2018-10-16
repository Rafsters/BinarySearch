public class BinarySearch {
    // Method returns index of given element(x) if it is present in array(arr[]),
    // If it is not present method returns -1
    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        System.out.println("Array length: " + arr.length + ", given element x: " + x);
        while (l <= r)
        {
            int m = l + (r-l)/2;
            System.out.println();
            System.out.println("Middle element (Value: " + arr[m] + ". Index: " + m + ")");
            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            System.out.println("Comparing value of middle element (" + arr[m] + ") to given element x (" + x + ").");
            System.out.println("arr[" + m + "]=" + arr[m] +  " < " + x + " - " + (arr[m] < x));

            if (arr[m] < x) {

                l = m + 1;
                System.out.println("The value of middle element is less than x, so right half is ignored");
            }
            else{
                r = m - 1;
                System.out.println("The value of middle element is greater than x, so left half is ignored");
            }
        }

        // Returns -1 if the element was not present in array
        return -1;
    }

}
