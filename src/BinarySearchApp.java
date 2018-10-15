
public class BinarySearchApp {
    public static void main(String args[]){
        int arr[] = RandomIntGenerator.generateRandomArrayOfIntegers(50);
        int n = arr.length;
        int x = 10;
        int result = BinarySearch.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element " + x + " found at " +
                    "index " + result);
    }
}
