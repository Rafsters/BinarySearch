public class BinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;
            System.out.println("Middle index: " + m);
            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            System.out.println("arr[" + m + "] = " + arr[m] +  " < " + x + "? " + (arr[m] < x));

            // If x greater, ignore left half
            if (arr[m] < x) {

                l = m + 1;
                System.out.println("Left half: " + l);
            }
                // If x is smaller, ignore right half
            else{
                r = m - 1;
                System.out.println("Right half: " + r);
            }
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

}
